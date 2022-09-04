package com.pc.example.activiti;

import com.pc.example.activiti.command.Command;

/**
 * 命令执行器
 *
 * @author pengchao
 * @since 2022/8/31 10:07
 */
public interface CommandExecutor {

    <T> T execute(CommandConfig config, Command<T> command);

    <T> T execute(Command<T> command);

}
