package com.pc.flyweight;

/**
 *
 * @author pengchao
 * @since 2022/8/9 10:48
 */
public class Client {

    public static void main(String[] args) {

        //内部状态不可以从客户端设置，否则就乱套了
        SignInfo signInfo = SignInfoFactory.getSignInfo(SignInfoFactory.Location.HIGH_SCHOOL_1.name() + "@" + SignInfoFactory.Subject.MATH.name());
        //外部状态必须从客户端设置
        signInfo.setId(2333L);
        signInfo.setPostAddress("23@qq.com");
        signInfo.setSignName("周杰伦");
        signInfo.operation();


        SignInfo signInfo2 = SignInfoFactory.getSignInfo(SignInfoFactory.Location.HIGH_SCHOOL_1.name() + "@" + SignInfoFactory.Subject.MATH.name());
        signInfo.setId(2334L);
        signInfo.setPostAddress("2333@qq.com");
        signInfo.setSignName("索隆");
        signInfo2.operation();


        System.out.println(signInfo == signInfo2);

    }
}
