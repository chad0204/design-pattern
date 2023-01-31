package com.pc.composite;

import java.util.List;

/**
 * 领导职位
 *
 * @author pengchao
 * @since 2023/1/31 14:01
 */
public interface IBranch extends ICrop {

    void addCrop(ICrop iCrop);

    List<ICrop> getChildes();
}
