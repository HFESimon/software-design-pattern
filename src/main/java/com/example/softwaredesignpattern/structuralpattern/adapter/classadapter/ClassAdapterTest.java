package com.example.softwaredesignpattern.structuralpattern.adapter.classadapter;

import com.example.softwaredesignpattern.structuralpattern.adapter.Target;

/**
 * @author wenjing.zsm
 * @version 1.0
 * @title:
 * @description:
 * @since 2022/6/10 2:51 下午
 */
public class ClassAdapterTest {

    public static void main(String[] args) {
        System.out.println("start test class adapter: ");
        Target target = new ClassAdapter();
        target.request();
    }
}
