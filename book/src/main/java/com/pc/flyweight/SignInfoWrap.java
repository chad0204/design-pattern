package com.pc.flyweight;

import lombok.Data;

/**
 *
 * @author pengchao
 * @since 2022/8/9 10:53
 */
@Data
public class SignInfoWrap extends SignInfo {
    /**
     * 考点 + 科目
     */
    private final String key;

    public SignInfoWrap(String key) {
        this.key = key;
        String[] strings = key.split("@");
        setLocation(strings[0]);
        setSubject(strings[1]);
    }
}
