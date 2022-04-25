package com.example.softwaredesignpattern.creationalpattern.factory.staticfactorymethod;

/**
 * @author wenjing.zsm
 * @version 1.0
 * @title:
 * @description:
 * @since 2022/4/11 3:34 下午
 */
public class SimpleFactory {

    public static Product makeProduct(Const kind) {
        switch (kind) {
            case PRODUCT_A:
                return new ConcreteProductA();

            case PRODUCT_B:
                return new ConcreteProductB();

            default:
                return null;
        }
    }
}
