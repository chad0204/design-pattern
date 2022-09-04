package com.pc.example.activiti;

import com.pc.example.activiti.command.Command;
import com.pc.example.activiti.interceptor.CommandInterceptor;

/**
 *
 * @author pengchao
 * @since 2022/8/31 10:21
 */
public class CommandExecutorImpl implements CommandExecutor {

    protected CommandInterceptor first;
    protected CommandConfig defaultConfig;

    public CommandExecutorImpl(CommandInterceptor first, CommandConfig defaultConfig) {
        this.first = first;
        this.defaultConfig = defaultConfig;
    }

    @Override
    public <T> T execute(CommandConfig config, Command<T> command) {
        return first.execute(config, command);
    }

    @Override
    public <T> T execute(Command<T> command) {
        return first.execute(defaultConfig, command);
    }
}
