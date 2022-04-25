package com.example.softwaredesignpattern.creationalpattern.factory.abstractfactory;

/**
 * @author wenjing.zsm
 * @version 1.0
 * @title:
 * @description:
 * @since 2022/4/13 10:57 上午
 */
public interface AbstractFactory {

    /**
     * 生产商品1
     * @return
     */
    Product1 makeProduct1();

    /**
     * 生产商品2
     * @return
     */
    Product2 makeProduct2();
}
