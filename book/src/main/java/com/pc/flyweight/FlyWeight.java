package com.pc.flyweight;

/**
 *
 * @author pengchao
 * @since 2023/2/1 21:48
 */
public abstract class FlyWeight {

    private Long id;

    private String postAddress;

    private String signName;

    public String operation() {
        return "base info{" +
                "id=" + id +
                ", postAddress='" + postAddress + '\'' +
                ", signName='" + signName + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPostAddress() {
        return postAddress;
    }

    public void setPostAddress(String postAddress) {
        this.postAddress = postAddress;
    }

    public String getSignName() {
        return signName;
    }

    public void setSignName(String signName) {
        this.signName = signName;
    }
}
