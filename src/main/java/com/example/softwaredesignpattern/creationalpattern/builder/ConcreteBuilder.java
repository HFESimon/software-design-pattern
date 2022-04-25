package com.example.softwaredesignpattern.creationalpattern.builder;

/**
 * @author wenjing.zsm
 * @version 1.0
 * @title:
 * @description:
 * @since 2022/4/25 2:08 下午
 */
public class ConcreteBuilder extends Builder{

    @Override
    public void buildPartA() {
        product.setPartA("build partA");
    }

    @Override
    public void buildPartB() {
        product.setPartB("build partB");
    }

    @Override
    public void buildPartC() {
        product.setPartC("build partC");
    }
}
