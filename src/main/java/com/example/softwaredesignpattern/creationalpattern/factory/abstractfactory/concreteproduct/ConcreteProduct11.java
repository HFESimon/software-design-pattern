package com.example.softwaredesignpattern.creationalpattern.factory.abstractfactory.concreteproduct;

import com.example.softwaredesignpattern.creationalpattern.factory.abstractfactory.Product1;

/**
 * @author wenjing.zsm
 * @version 1.0
 * @title:
 * @description:
 * @since 2022/4/13 10:56 上午
 */
public class ConcreteProduct11 implements Product1 {

    @Override
    public void showProduct() {
        System.out.println("具体商品11展示....");
    }
}
