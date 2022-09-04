package com.pc.example.activiti.interceptor;

import com.pc.example.activiti.CommandConfig;
import com.pc.example.activiti.command.Command;

/**
 *
 * @author pengchao
 * @since 2022/8/31 14:23
 */
public class LogInterceptor extends AbstractCommandInterceptor {
    @Override
    public <T> T execute(CommandConfig commandConfig, Command<T> command) {
        System.out.println();
        System.out.printf("--- starting {%s} --------------------------------------------------------\n", command.getClass().getSimpleName());
        try {
            return getNext().execute(commandConfig, command);
        } finally {
            System.out.printf("--- {%s} finished --------------------------------------------------------", command.getClass().getSimpleName());
            System.out.println();
        }
    }


}
