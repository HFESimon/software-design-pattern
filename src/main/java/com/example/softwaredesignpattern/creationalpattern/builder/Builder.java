package com.example.softwaredesignpattern.creationalpattern.builder;

/**
 * @author wenjing.zsm
 * @version 1.0
 * @title:
 * @description:
 * @since 2022/4/25 11:19 上午
 */
abstract class Builder {

    protected Product product = new Product();

    /**
     * 建造部件A
     */
    public abstract void buildPartA();

    /**
     * 建造部件B
     */
    public abstract void buildPartB();

    /**
     * 建造部件C
     */
    public abstract void buildPartC();

    /**
     * 返回产品对象
     * @return
     */
    public Product getResult() {
        return product;
    }
}
