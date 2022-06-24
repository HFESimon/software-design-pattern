package com.example.softwaredesignpattern.structuralpattern.bridge;

/**
 * @author wenjing.zsm
 * @version 1.0
 * @title:
 * @description:
 * @since 2022/6/24 10:56 上午
 */

public class ConcreteImplementorA implements Implementor{

    @Override
    public void operationImpl() {
        System.out.println("concrete implementor has been request");
    }
}
