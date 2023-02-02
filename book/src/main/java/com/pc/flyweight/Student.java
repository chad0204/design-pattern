package com.pc.flyweight;

import lombok.Data;

/**
 *
 * 外部状态
 *
 * @author pengchao
 * @since 2023/1/31 18:36
 */
@Data
public class Student extends FlyWeight {

    /**
     * 内部状态
     */
    private SignInfo signInfo;

    public String operation() {
        return super.operation() + "进入" + signInfo.getLocation() + "进行" + signInfo.getSubject() + "考试";
    }

}
