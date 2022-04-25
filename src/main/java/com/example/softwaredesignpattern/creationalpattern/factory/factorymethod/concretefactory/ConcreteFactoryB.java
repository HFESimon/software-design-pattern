package com.example.softwaredesignpattern.creationalpattern.factory.factorymethod.concretefactory;

import com.example.softwaredesignpattern.creationalpattern.factory.factorymethod.AbstractFactory;
import com.example.softwaredesignpattern.creationalpattern.factory.factorymethod.Product;
import com.example.softwaredesignpattern.creationalpattern.factory.factorymethod.concreteproduct.ConcreteProductB;

/**
 * @author wenjing.zsm
 * @version 1.0
 * @title:
 * @description:
 * @since 2022/4/13 10:43 上午
 */
public class ConcreteFactoryB implements AbstractFactory {
    @Override
    public Product newProduct() {
        System.out.println("具体工厂2生成-->具体产品2...");
        return new ConcreteProductB();
    }
}
