package com.example.softwaredesignpattern.creationalpattern.factory.abstractfactory;

import com.example.softwaredesignpattern.creationalpattern.factory.abstractfactory.concretefactory.ConcreteFactoryA;
import com.example.softwaredesignpattern.creationalpattern.factory.abstractfactory.concretefactory.ConcreteFactoryB;

/**
 * @author wenjing.zsm
 * @version 1.0
 * @title:
 * @description:
 * @since 2022/4/13 10:55 上午
 */
public class AbstractFactoryTest {

    public static void main(String[] args) {
        AbstractFactory abstractFactory = new ConcreteFactoryA();
        Product1 product1 = abstractFactory.makeProduct1();
        product1.showProduct();
        Product2 product2 = abstractFactory.makeProduct2();
        product2.showProduct();

        AbstractFactory factory = new ConcreteFactoryB();
        Product1 product11 = factory.makeProduct1();
        product11.showProduct();
        Product2 product21 = factory.makeProduct2();
        product21.showProduct();
    }
}
