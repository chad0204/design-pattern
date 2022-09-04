package com.pc.example.activiti.interceptor;

import com.pc.example.activiti.CommandConfig;
import com.pc.example.activiti.CommandContext;
import com.pc.example.activiti.Context;
import com.pc.example.activiti.command.Command;

/**
 *
 * @author pengchao
 * @since 2022/8/31 14:30
 */
public class CommandContextInterceptor extends AbstractCommandInterceptor {
    @Override
    public <T> T execute(CommandConfig commandConfig, Command<T> command) {
        CommandContext context = Context.getCommandContext();
        if (context == null) {
            context = new CommandContext(command);
        }
        try {
            Context.setCommandContext(context);
            return getNext().execute(commandConfig, command);
        } finally {
            Context.removeCommandContext();
        }
    }
}
