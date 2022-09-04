package com.pc.example.activiti;

import java.util.Stack;

/**
 *
 * @author pengchao
 * @since 2022/8/31 14:33
 */
public class Context {

    protected static ThreadLocal<Stack<CommandContext>> commandContextThreadLocal = new ThreadLocal<Stack<CommandContext>>();

    public static CommandContext getCommandContext() {
        Stack<CommandContext> stack = getStack(commandContextThreadLocal);
        if (stack.isEmpty()) {
            return null;
        }
        return stack.peek();
    }

    public static void setCommandContext(CommandContext commandContext) {
        getStack(commandContextThreadLocal).push(commandContext);
    }

    public static void removeCommandContext() {
        getStack(commandContextThreadLocal).pop();
    }

    protected static <T> Stack<T> getStack(ThreadLocal<Stack<T>> threadLocal) {
        Stack<T> stack = threadLocal.get();
        if (stack == null) {
            stack = new Stack<T>();
            threadLocal.set(stack);
        }
        return stack;
    }

}
