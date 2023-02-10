package com.pc.chainofresponsibility;

/**
 *
 *  如何构建责任链
 *
 *  1. 外部控制，统一维护责任链，并维护处理的索引。
 *  2. 内部控制，每个节点维护自己下一个节点，这是和composite模式结合。
 *
 * @author pengchao
 * @since 2022/8/9 15:25
 */
public class Client {

    /**
     *
     * 用户注册
     *
     * 填写信息 -> kyc -> 审核 -> 登录
     *
     *
     *
     * @param args
     */
    public static void main(String[] args) {
        User user = new User();
        user.setType(Type.FILL);
        buildChain().register(user);
        login(user);
    }

    private static void login(User user) {
        if (user.getType() == Type.DONE || user.getDoneStep().size() == 3) {
            System.out.println("login ok!");
        }
    }

    private static RegisterHandler buildChain() {
        return RegisterHandler.builder()
                .addHandler(new FillInfoHandler())
                .addHandler(new KycHandler())
                .addHandler(new AuditHandler())
                //可扩展
                .build();
    }

}
