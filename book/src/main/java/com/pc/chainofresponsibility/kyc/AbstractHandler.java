package com.pc.chainofresponsibility.kyc;

public abstract class AbstractHandler<T extends HandlerContext<String>> implements Handler<T, String> {
    @Override
    public String handle(T context) {
        return null;
    }



    protected abstract String doHandle(T context);
}
