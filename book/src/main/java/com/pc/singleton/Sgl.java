package com.pc.singleton;

/**
 *
 * @author pengchao
 * @since 2023/1/30 16:15
 */
public class Sgl {
    private volatile static Sgl sgl = null;// 防止new 低层指令重排

    private Sgl() {
    }

    public static Sgl getInstance() {
        if (sgl == null) {//性能考虑, 必要无效加锁
            synchronized (Sgl.class) {
                if (sgl == null) {//防止其他等待锁的线程，在当前拥有锁的线程结束后，重新初始化。
                    sgl = new Sgl();
                }
            }
        }
        return sgl;
    }
}
