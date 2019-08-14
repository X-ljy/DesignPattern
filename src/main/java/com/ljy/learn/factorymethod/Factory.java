package com.ljy.learn.factorymethod;

/**
 * @author : 夕
 * @date : 2019/8/14
 */
public abstract class Factory {
    public final Product create(String owner) {
        Product p = createProduct(owner);
        registerProduct(p);
        return p;
    }

    public abstract Product createProduct(String owner);

    public abstract void registerProduct(Product product);
}
