package com.pc.chainofresponsibility;

import java.util.ArrayList;

/**
 * @author pengchao
 * @since 2022/8/9 16:29
 */
public class KycHandler extends RegisterHandler {

    @Override
    protected void doRegister(User user) {
        if (user.getDoneStep() == null) {
            user.setDoneStep(new ArrayList<>());
        }
        user.getDoneStep().add("kyc done");
        user.setType(Type.AUDIT);
        System.out.println("kyc success! ");
    }

    @Override
    protected boolean isMatch(Type type) {
        return Type.KYC == type;
    }
}
