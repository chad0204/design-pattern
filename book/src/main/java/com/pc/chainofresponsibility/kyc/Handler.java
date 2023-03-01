package com.pc.chainofresponsibility.kyc;

public interface Handler<T extends HandlerContext<V>, V> {

    V handle(T context);
}
