package com.ljy.learn.factorymethod;

/**
 * @author : 夕
 * @date : 2019/8/14
 */
public class IdCard extends Product {

    private String owner;

    public IdCard(String owner) {
        System.out.println("制作 " + owner + " ID卡");
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println("使用 " + owner + " 的ID卡");
    }

    public String getOwner() {
        return owner;
    }

}
