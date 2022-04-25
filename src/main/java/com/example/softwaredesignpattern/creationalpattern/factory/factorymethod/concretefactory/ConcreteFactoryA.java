package com.example.softwaredesignpattern.creationalpattern.factory.factorymethod.concretefactory;

import com.example.softwaredesignpattern.creationalpattern.factory.factorymethod.AbstractFactory;
import com.example.softwaredesignpattern.creationalpattern.factory.factorymethod.Product;
import com.example.softwaredesignpattern.creationalpattern.factory.factorymethod.concreteproduct.ConcreteProductA;

/**
 * @author wenjing.zsm
 * @version 1.0
 * @title:
 * @description:
 * @since 2022/4/13 10:42 上午
 */
public class ConcreteFactoryA implements AbstractFactory {

    @Override
    public Product newProduct() {
        System.out.println("具体工厂1生成-->具体产品1...");
        return new ConcreteProductA();
    }
}
