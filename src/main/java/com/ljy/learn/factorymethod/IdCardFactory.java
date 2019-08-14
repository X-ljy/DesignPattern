package com.ljy.learn.factorymethod;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : 夕
 * @date : 2019/8/14
 */
public class IdCardFactory extends Factory {

    private List owners = new ArrayList();

    @Override
    public Product createProduct(String owner) {
        return new IdCard(owner);
    }

    @Override
    public void registerProduct(Product product) {
        owners.add(((IdCard) product).getOwner());
    }

    public List getOwners() {
        return owners;
    }
}
