package com.pc.flyweight;

/**
 *
 * @author pengchao
 * @since 2022/8/9 10:48
 */
public class Client {

    public static void main(String[] args) {

        //内部状态不可以从客户端设置，否则就乱套了
        FlyWeight student = SignInfoFactory.getSignInfo(SignInfoFactory.Location.HIGH_SCHOOL_1.name() + "@" + SignInfoFactory.Subject.MATH.name());
        //外部状态必须从客户端设置
        student.setId(2333L);
        student.setPostAddress("23@qq.com");
        student.setSignName("周杰伦");
        System.out.println(student.operation());


        FlyWeight student2 = SignInfoFactory.getSignInfo(SignInfoFactory.Location.HIGH_SCHOOL_1.name() + "@" + SignInfoFactory.Subject.MATH.name());
        student2.setId(2334L);
        student2.setPostAddress("2333@qq.com");
        student2.setSignName("索隆");
        System.out.println(student2.operation());

        //讲道理应该将内部状态抽出来作为一个内部对象（而不是继承），缓存这些内部对象，被SignInfo引用。否则SignInfo会有线程安全问题。



    }
}
