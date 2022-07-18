package com.pc.oop.interfaceIsolation;

/**
 *
 * @author pengchao
 * @since 2022/7/15 16:31
 */
public class TemperamentPrettyGirlSearcher {

    public boolean checkGirl(IPrettyGirl prettyGirl) {
        return prettyGirl.isTemperament();
    }
}
