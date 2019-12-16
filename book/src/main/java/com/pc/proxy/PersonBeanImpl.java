package com.pc.proxy;

/**
 * @author dx
 * @className PersonBeanImpl
 * @description
 * @date 2019-08-16 11:12
 */
public class PersonBeanImpl implements PersonBean {

    private String name;
    private String gender;
    private String interests;
    private int rating;
    private int ratingCount = 0;

    public PersonBeanImpl(String name, String gender, String interests) {
        this.name = name;
        this.gender = gender;
        this.interests = interests;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getGender() {
        return gender;
    }

    @Override
    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String getInterests() {
        return interests;
    }

    @Override
    public void setInterests(String interests) {
        this.interests = interests;
    }

    @Override
    public int getHotOrNotRating() {
        if(ratingCount==0) return 0;
        return rating/ratingCount;
    }

    @Override
    public void doHotOrNotRating(int rating) {
        this.rating += rating;
        ratingCount++;
    }


}
