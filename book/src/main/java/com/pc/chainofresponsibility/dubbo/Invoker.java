package com.pc.chainofresponsibility.dubbo;

/**
 * 实际发起rpc调用的接口
 * @author pengchao
 * @since 2023/2/21 15:11
 */
public interface Invoker {
    String invoke(String invocation);
}
