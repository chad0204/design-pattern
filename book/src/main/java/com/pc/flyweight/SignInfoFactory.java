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

    //排列组合最多四种考点信息（内部状态）
    static {
        pool.put(Location.HIGH_SCHOOL_1.name() + "@" + Subject.ENGLISH.name(), new SignInfo(Location.HIGH_SCHOOL_1.name(),  Subject.ENGLISH.name()));
        pool.put(Location.HIGH_SCHOOL_1.name() + "@" + Subject.MATH.name(), new SignInfo(Location.HIGH_SCHOOL_1.name(), Subject.MATH.name()));
        pool.put(Location.MIDDLE_SCHOOL_2.name() + "@" + Subject.ENGLISH.name(), new SignInfo(Location.MIDDLE_SCHOOL_2.name(), Subject.ENGLISH.name()));
        pool.put(Location.MIDDLE_SCHOOL_2.name() + "@" + Subject.MATH.name(), new SignInfo(Location.MIDDLE_SCHOOL_2.name(), Subject.MATH.name()));
    }

    public static SignInfo getSignInfo(String key) {
        if (pool.containsKey(key)) {
            return pool.get(key);
        }
        SignInfo signInfo = new SignInfo(Location.HIGH_SCHOOL_1.name(),  Subject.ENGLISH.name());
        pool.put(key, signInfo);
        return signInfo;
    }

    //科目
    enum Subject {
        MATH,
        ENGLISH
    }

    //考点
    enum Location {
        HIGH_SCHOOL_1,
        MIDDLE_SCHOOL_2
    }
}
