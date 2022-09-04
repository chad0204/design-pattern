package com.pc.example.activiti.interceptor;

/**
 *
 * @author pengchao
 * @since 2022/8/31 14:23
 */
public abstract class AbstractCommandInterceptor implements CommandInterceptor {

    private CommandInterceptor next;

    @Override
    public CommandInterceptor getNext() {
        return this.next;
    }

    @Override
    public void setNext(CommandInterceptor next) {
        this.next = next;
    }
}
