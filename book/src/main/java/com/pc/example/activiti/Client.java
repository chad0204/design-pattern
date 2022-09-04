package com.pc.example.activiti;

import com.pc.example.activiti.command.Command;
import com.pc.example.activiti.command.MyCommand;
import com.pc.example.activiti.interceptor.CommandContextInterceptor;
import com.pc.example.activiti.interceptor.CommandInterceptor;
import com.pc.example.activiti.interceptor.CommandInvoker;
import com.pc.example.activiti.interceptor.LogInterceptor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 *
 * @author pengchao
 * @since 2022/8/30 11:30
 */
public class Client {

    protected CommandConfig commandConfig;

    protected CommandConfig defaultCommandConfig;

    /**
     * 前置拦截器
     */
    protected List<CommandInterceptor> customPreCommandInterceptors;

    /**
     * 后置拦截器
     */
    protected List<CommandInterceptor> customPostCommandInterceptors;

    /**
     * 真正调用command的拦截器。 无next
     */
    protected CommandInterceptor commandInvoker;

    /**
     * 所有拦截器， 前置 -> 必要 -> 后置 ->  commandInvoker
     */
    protected List<CommandInterceptor> commandInterceptors;

    protected CommandExecutor commandExecutor;

    public Client() {
        this.commandConfig = new CommandConfig();
        init();
    }

    public Client(List<CommandInterceptor> customPreCommandInterceptors,
                  List<CommandInterceptor> customPostCommandInterceptors) {
        this.commandConfig = new CommandConfig();
        this.customPreCommandInterceptors = customPreCommandInterceptors;
        this.customPostCommandInterceptors = customPostCommandInterceptors;
        init();
    }

    public void init() {
        this.initCommandInvoker();
        this.initInterceptors();
        this.initCommandExecutor();
    }

    private void initCommandInvoker() {
        commandInvoker = new CommandInvoker();
    }

    private void initInterceptors() {
        //initCommandInterceptors add多个命令 pre default post invoke等
        if (commandInterceptors == null) {
            commandInterceptors = new ArrayList<>();
            if (customPreCommandInterceptors != null) {
                commandInterceptors.addAll(customPreCommandInterceptors);
            }
            commandInterceptors.addAll(getDefaultCommandInterceptors());
            if (customPostCommandInterceptors != null) {
                commandInterceptors.addAll(customPostCommandInterceptors);
            }
            commandInterceptors.add(commandInvoker);
        }
    }

    private Collection<? extends CommandInterceptor> getDefaultCommandInterceptors() {
        List<CommandInterceptor> interceptors = new ArrayList<>();
        interceptors.add(new LogInterceptor());
        interceptors.add(new CommandContextInterceptor());
        return interceptors;
    }

    private void initCommandExecutor() {
        //build chain
        CommandInterceptor first = initInterceptorChain(commandInterceptors);
        this.commandExecutor = new CommandExecutorImpl(first, defaultCommandConfig);
    }


    private CommandInterceptor initInterceptorChain(List<CommandInterceptor> chain) {
        if (chain == null || chain.isEmpty()) {
            throw new IllegalArgumentException("invalid command interceptor chain configuration: " + chain);
        }
        for (int i = 0; i < chain.size() - 1; i++) {
            chain.get(i).setNext(chain.get(i +1));
        }
        return chain.get(0);
    }

    public String executeCommand(Command<String> command) {
        return commandExecutor.execute(command);
    }



    public static void main(String[] args) {
        Client client = new Client();

        String res = client.executeCommand(new MyCommand());

        System.out.println(Context.getCommandContext());
        System.out.println(res);
    }

}
