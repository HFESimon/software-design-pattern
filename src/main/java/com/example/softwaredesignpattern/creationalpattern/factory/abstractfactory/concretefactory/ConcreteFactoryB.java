package com.example.softwaredesignpattern.creationalpattern.factory.abstractfactory.concretefactory;

import com.example.softwaredesignpattern.creationalpattern.factory.abstractfactory.AbstractFactory;
import com.example.softwaredesignpattern.creationalpattern.factory.abstractfactory.Product1;
import com.example.softwaredesignpattern.creationalpattern.factory.abstractfactory.Product2;
import com.example.softwaredesignpattern.creationalpattern.factory.abstractfactory.concreteproduct.ConcreteProduct12;
import com.example.softwaredesignpattern.creationalpattern.factory.abstractfactory.concreteproduct.ConcreteProduct22;

/**
 * @author wenjing.zsm
 * @version 1.0
 * @title:
 * @description:
 * @since 2022/4/13 11:03 上午
 */
public class ConcreteFactoryB implements AbstractFactory {

    @Override
    public Product1 makeProduct1() {
        System.out.println("具体工厂2生成-->具体产品1...");
        return new ConcreteProduct12();
    }

    @Override
    public Product2 makeProduct2() {
        System.out.println("具体工厂2生成-->具体产品2...");
        return new ConcreteProduct22();
    }
}
