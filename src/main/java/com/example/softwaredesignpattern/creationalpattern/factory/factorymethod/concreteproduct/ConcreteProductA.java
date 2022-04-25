package com.example.softwaredesignpattern.creationalpattern.factory.factorymethod.concreteproduct;

import com.example.softwaredesignpattern.creationalpattern.factory.factorymethod.Product;

/**
 * @author wenjing.zsm
 * @version 1.0
 * @title:
 * @description:
 * @since 2022/4/13 10:37 上午
 */
public class ConcreteProductA implements Product {

    @Override
    public void showProduct() {
        System.out.println("具体产品1展示....");
    }
}
