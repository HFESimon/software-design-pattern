package com.example.softwaredesignpattern.creationalpattern.singleton.singletonlazy;

/**
 * @author wenjing.zsm
 * @version 1.0
 * @title:
 * @description:
 * @since 2022/2/22 11:48 下午
 */
public class SingletonLazy {

    public static void main(String[] args) {
        President president1 =  President.getInstance();
        president1.getName();

        President president2 =  President.getInstance();
        president2.getName();
    }
}
