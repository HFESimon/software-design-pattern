package com.example.softwaredesignpattern.creationalpattern.factory.factorymethod;

/**
 * @author wenjing.zsm
 * @version 1.0
 * @title:
 * @description:
 * @since 2022/4/13 10:39 上午
 */
public interface AbstractFactory {

    /**
     * 生产新产品
     * @return
     */
    Product newProduct();
}
