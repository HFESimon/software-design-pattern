package com.example.softwaredesignpattern.structuralpattern.adapter;

import org.springframework.stereotype.Component;

/**
 * @author wenjing.zsm
 * @version 1.0
 * @title:
 * @description: 适配者
 * @since 2022/6/10 2:46 下午
 */

@Component
public class Adaptee {

    /**
     * adaptee method
     */
    public void specificRequest() {
        System.out.println("the business code in adaptee has been called!");
    }
}
