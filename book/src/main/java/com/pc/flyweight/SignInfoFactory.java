package com.pc.flyweight;


import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author pengchao
 * @since 2022/8/9 10:55
 */
public class SignInfoFactory {

    private static Map<String, SignInfo> pool = new HashMap<>();

    static {
        pool.put(Location.HIGH_SCHOOL_1.name() + "@" + Subject.ENGLISH.name(), new SignInfoWrap(Location.HIGH_SCHOOL_1.name() + "@" + Subject.ENGLISH.name()));
        pool.put(Location.HIGH_SCHOOL_1.name() + "@" + Subject.MATH.name(), new SignInfoWrap(Location.HIGH_SCHOOL_1.name() + "@" + Subject.MATH.name()));
        pool.put(Location.MIDDLE_SCHOOL_2.name() + "@" + Subject.ENGLISH.name(), new SignInfoWrap(Location.MIDDLE_SCHOOL_2.name() + "@" + Subject.ENGLISH.name()));
        pool.put(Location.MIDDLE_SCHOOL_2.name() + "@" + Subject.MATH.name(), new SignInfoWrap(Location.MIDDLE_SCHOOL_2.name() + "@" + Subject.MATH.name()));
    }

    public static SignInfo getSignInfo(String key) {
        if (pool.containsKey(key)) {
            return pool.get(key);
        }
        SignInfo signInfo = new SignInfoWrap(key);
        pool.put(key, signInfo);
        return signInfo;
    }


    enum Subject {
        MATH,
        ENGLISH
    }

    enum Location {
        HIGH_SCHOOL_1,
        MIDDLE_SCHOOL_2
    }
}
