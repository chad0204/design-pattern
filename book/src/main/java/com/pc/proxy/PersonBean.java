package com.pc.proxy;

public interface PersonBean {

    /**
     * 所有人能访问
     */
    String getName();
    int getHotOrNotRating();
    String getGender();
    String getInterests();


    /**
     * 自己能访问
     */
    void setName(String name);
    void setGender(String gender);
    void setInterests(String interests);

    /**
     * 别人能访问
     */
    void doHotOrNotRating(int rating);
}
