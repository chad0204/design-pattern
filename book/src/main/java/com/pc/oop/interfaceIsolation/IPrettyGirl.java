package com.pc.oop.interfaceIsolation;

/**
 *
 * IPrettyGirl对于只要气质好就算美女的检查规则来说，暴露太多接口
 *
 * 拆成
 * @see InnerPrettyGirl
 * @see BodyPrettyGirl
 *
 * @author pengchao
 * @since 2022/7/15 15:17
 */
public interface IPrettyGirl {

    //外观
    boolean isGoodLook();
    //外观
    boolean isNiceFigure();
    //内涵
    boolean isTemperament();
}
