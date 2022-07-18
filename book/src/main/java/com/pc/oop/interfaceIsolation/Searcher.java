package com.pc.oop.interfaceIsolation;

/**
 * @author pengchao
 * @since 2022/7/15 15:18
 */
public abstract class Searcher {

    public void searchPrettyGirl(IPrettyGirl prettyGirl) {
        System.out.println(checkGirl(prettyGirl));
    }

    /**
     * 原先的标准是，三项符合才是美女
     * 后面想改成只要有气质就是美女，那么对于检查气质美女的功能来说，女孩就暴露了过多的接口了。
     * @param prettyGirl
     */
    public boolean checkGirl(IPrettyGirl prettyGirl) {
        return prettyGirl.isGoodLook()
                && prettyGirl.isNiceFigure()
                && prettyGirl.isTemperament();
    }
}
