package com.example.softwaredesignpattern.creationalpattern.factory.staticfactorymethod;

/**
 * @author wenjing.zsm
 * @version 1.0
 * @title:
 * @description:
 * @since 2022/4/11 3:05 下午
 */
public class SimpleFactoryTest {

    public static void main(String[] args) {
        Product product = SimpleFactory.makeProduct(Const.PRODUCT_A);
        assert product != null;
        product.showProduct();
    }
}
