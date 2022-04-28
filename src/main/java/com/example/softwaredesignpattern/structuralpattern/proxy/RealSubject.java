package com.example.softwaredesignpattern.structuralpattern.proxy;

import org.springframework.stereotype.Component;

/**
 * @author wenjing.zsm
 * @version 1.0
 * @title:
 * @description:
 * @since 2022/4/28 3:05 下午
 */

@Component
public class RealSubject implements Subject{


    @Override
    public void request() {
        System.out.println("request real subject method...");
    }
}
