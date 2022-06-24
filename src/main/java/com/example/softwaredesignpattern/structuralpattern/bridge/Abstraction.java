package com.example.softwaredesignpattern.structuralpattern.bridge;

import javax.annotation.Resource;

/**
 * @author wenjing.zsm
 * @version 1.0
 * @title:
 * @description: 抽象化角色
 * @since 2022/6/24 10:53 上午
 */

abstract class Abstraction {

    protected Implementor implementor;

    protected Abstraction(Implementor implementor) {
        this.implementor = implementor;
    }

    /**
     * 扩展抽象化方法
     */
    public abstract void operation();
}
