package com.pc.example.activiti.interceptor;

import com.pc.example.activiti.CommandConfig;
import com.pc.example.activiti.CommandContext;
import com.pc.example.activiti.Context;
import com.pc.example.activiti.command.Command;

/**
 *
 * 拦截器链的末尾, 无next, invoke command
 *
 * @author pengchao
 * @since 2022/8/31 14:42
 */
public class CommandInvoker extends AbstractCommandInterceptor {
    @Override
    public <T> T execute(CommandConfig commandConfig, Command<T> command) {

        CommandContext commandContext = Context.getCommandContext();

        commandContext.setResult(command.execute(commandContext));

        return (T) commandContext.getResult();
    }


    @Override
    public CommandInterceptor getNext() {
        throw new UnsupportedOperationException();
    }
}
