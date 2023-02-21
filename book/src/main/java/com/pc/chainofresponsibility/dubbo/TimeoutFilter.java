package com.pc.chainofresponsibility.dubbo;

/**
 *
 * @author pengchao
 * @since 2023/2/21 15:16
 */
public class TimeoutFilter implements Filter {
    @Override
    public String invoke(Invoker invoker, String invocation) {
        return invoker.invoke(invocation + "[timeout]");
    }
}
