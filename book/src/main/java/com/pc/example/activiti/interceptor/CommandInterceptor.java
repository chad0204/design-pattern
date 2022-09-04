package com.pc.example.activiti.interceptor;

import com.pc.example.activiti.command.Command;
import com.pc.example.activiti.CommandConfig;

/**
 * 命令执行拦截器
 *
 * @author pengchao
 * @since 2022/8/30 11:33
 */
public interface CommandInterceptor {

    <T> T execute(CommandConfig commandConfig, Command<T> command);

    CommandInterceptor getNext();

    void setNext(CommandInterceptor next);

}
