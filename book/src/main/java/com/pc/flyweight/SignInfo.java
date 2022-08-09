package com.pc.flyweight;

import lombok.Data;

/**
 *
 * @author pengchao
 * @since 2022/8/9 10:53
 */
@Data
public class SignInfo {

    private Long id;

    private String location;

    private String subject;

    private String postAddress;

    private String signName;

    public void operation() {
        System.out.println(signName + "进入" + location + "进行" + subject + "考试");
    }
}
