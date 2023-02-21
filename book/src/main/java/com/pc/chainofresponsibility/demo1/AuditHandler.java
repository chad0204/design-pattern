package com.pc.chainofresponsibility.demo1;

import java.util.ArrayList;

/**
 * @author pengchao
 * @since 2022/8/9 16:29
 */
public class AuditHandler extends RegisterHandler {


    @Override
    protected void doRegister(User user) {
        if (user.getDoneStep() == null) {
            user.setDoneStep(new ArrayList<>());
        }
        user.getDoneStep().add("audit done");
        user.setType(Type.DONE);
        System.out.println("audit success! ");
    }

    @Override
    protected boolean isMatch(Type type) {
        return Type.AUDIT == type;
    }
}
