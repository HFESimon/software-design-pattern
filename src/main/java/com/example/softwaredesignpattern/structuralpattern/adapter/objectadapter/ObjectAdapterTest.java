package com.example.softwaredesignpattern.structuralpattern.adapter.objectadapter;

import com.example.softwaredesignpattern.structuralpattern.adapter.Adaptee;
import com.example.softwaredesignpattern.structuralpattern.adapter.Target;

/**
 * @author wenjing.zsm
 * @version 1.0
 * @title:
 * @description:
 * @since 2022/6/10 3:05 下午
 */
public class ObjectAdapterTest {

    public static void main(String[] args) {
        System.out.println("start test object adapter: ");
        Target target = new ObjectAdapter(new Adaptee());
        target.request();
    }
}
