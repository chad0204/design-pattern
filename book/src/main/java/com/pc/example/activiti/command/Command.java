package com.pc.example.activiti.command;

import com.pc.example.activiti.CommandContext;

/**
 * 命令
 *
 * @author pengchao
 * @since 2022/8/30 11:30
 */
public interface Command<T> {
    T execute(CommandContext commandContext);
}
