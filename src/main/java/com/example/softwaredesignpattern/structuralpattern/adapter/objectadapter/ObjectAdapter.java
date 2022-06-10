package com.example.softwaredesignpattern.structuralpattern.adapter.objectadapter;

import com.example.softwaredesignpattern.structuralpattern.adapter.Adaptee;
import com.example.softwaredesignpattern.structuralpattern.adapter.Target;

/**
 * @author wenjing.zsm
 * @version 1.0
 * @title:
 * @description:
 * @since 2022/6/10 3:03 下午
 */
public class ObjectAdapter implements Target {

    private Adaptee adaptee;

    public ObjectAdapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
