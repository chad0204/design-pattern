package com.pc.flyweight;

import lombok.Data;

/**
 *
 * @author pengchao
 * @since 2022/8/9 10:53
 */
@Data
public class SignInfo extends FlyWeight {

    private final String location;

    private final String subject;


    public SignInfo(String location, String subject) {
        this.location = location;
        this.subject = subject;
    }
}
