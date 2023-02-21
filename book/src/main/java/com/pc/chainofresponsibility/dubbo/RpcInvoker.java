package com.pc.chainofresponsibility.dubbo;

/**
 * 就是通过rpc或者http发起请求
 *
 * @author pengchao
 * @since 2023/2/21 15:21
 */
public class RpcInvoker implements Invoker {
    @Override
    public String invoke(String invocation) {
        return invocation + "rpc request done";
    }
}
