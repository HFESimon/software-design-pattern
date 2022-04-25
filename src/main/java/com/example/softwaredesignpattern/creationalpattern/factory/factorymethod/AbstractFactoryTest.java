package com.example.softwaredesignpattern.creationalpattern.factory.factorymethod;

import com.example.softwaredesignpattern.creationalpattern.factory.factorymethod.concretefactory.ConcreteFactoryA;

/**
 * @author wenjing.zsm
 * @version 1.0
 * @title:
 * @description:
 * @since 2022/4/12 2:21 下午
 */
public class AbstractFactoryTest {

    public static void main(String[] args) {
        AbstractFactory af = new ConcreteFactoryA();
        Product a = af.newProduct();
        a.showProduct();
    }
}
