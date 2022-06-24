package com.example.softwaredesignpattern.structuralpattern.bridge;

/**
 * @author wenjing.zsm
 * @version 1.0
 * @title:
 * @description:
 * @since 2022/6/24 11:03 上午
 */
public class RefinedAbstraction extends Abstraction{

    protected RefinedAbstraction(Implementor implementor) {
        super(implementor);
    }

    @Override
    public void operation() {
        System.out.println("refined abstraction has been request");
        implementor.operationImpl();
    }
}
