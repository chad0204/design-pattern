package com.pc.chainofresponsibility.demo1;

import java.util.ArrayList;

/**
 *
 * @author pengchao
 * @since 2022/8/9 16:28
 */
public class FillInfoHandler extends RegisterHandler {

    @Override
    protected void doRegister(User user) {
        if (user.getDoneStep() == null) {
            user.setDoneStep(new ArrayList<>());
        }
        user.getDoneStep().add("fill done");
        user.setType(Type.KYC);
        System.out.println("fill success! ");
    }

    @Override
    public boolean isMatch(Type type) {
        return Type.FILL == type;
    }
}
