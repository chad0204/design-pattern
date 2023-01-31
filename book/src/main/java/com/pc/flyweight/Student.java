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
public class Student {
    private Long id;

    private String postAddress;

    private String signName;

    /**
     * 内部状态
     */
    private SignInfo signInfo;


    public void operation() {
        System.out.println(signName + "进入" + signInfo.getLocation() + "进行" + signInfo.getSubject() + "考试");
    }

}
