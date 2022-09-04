package com.pc.example.activiti;

import com.pc.example.activiti.command.Command;

import java.util.LinkedList;

/**
 * 命令上下文
 *
 * @author pengchao
 * @since 2022/8/30 11:35
 */
public class CommandContext {

    protected Command<?> command;

    protected LinkedList<Object> resultStack = new LinkedList<>();

    public CommandContext(Command<?> command) {
        this.command = command;
    }

    public Object getResult() {
        return resultStack.pollLast();
    }

    public void setResult(Object result) {
        resultStack.add(result);
    }
}
