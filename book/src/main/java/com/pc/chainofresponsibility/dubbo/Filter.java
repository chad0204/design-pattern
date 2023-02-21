package com.pc.chainofresponsibility.dubbo;

/**
 *
 * @author pengchao
 * @since 2023/2/21 15:11
 */
public interface Filter {
    String invoke(Invoker invoker, String invocation);
}
