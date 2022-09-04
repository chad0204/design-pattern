package com.pc.example.activiti.command;

import com.pc.example.activiti.CommandContext;

/**
 *
 *
 * @author pengchao
 * @since 2022/8/31 11:04
 */
public class MyCommand implements Command<String> {
    @Override
    public String execute(CommandContext commandContext) {
        System.out.println("myCommand executed");
        return "okokok";
    }
}
