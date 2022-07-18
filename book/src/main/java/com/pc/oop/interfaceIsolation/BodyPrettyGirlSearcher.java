package com.pc.oop.interfaceIsolation;

/**
 * TODO
 *
 * @author pengchao
 * @since 2022/7/15 16:31
 */
public class BodyPrettyGirlSearcher extends Searcher{

    public boolean checkGirl(IPrettyGirl prettyGirl) {
        return prettyGirl.isGoodLook()
                && prettyGirl.isNiceFigure();
    }
}
