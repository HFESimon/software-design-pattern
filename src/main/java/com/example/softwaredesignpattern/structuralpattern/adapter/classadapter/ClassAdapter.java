package com.example.softwaredesignpattern.structuralpattern.adapter.classadapter;

import com.example.softwaredesignpattern.structuralpattern.adapter.Adaptee;
import com.example.softwaredesignpattern.structuralpattern.adapter.Target;
import org.springframework.stereotype.Service;

/**
 * @author wenjing.zsm
 * @version 1.0
 * @title:
 * @description:
 * @since 2022/6/10 2:49 下午
 */

@Service
public class ClassAdapter extends Adaptee implements Target {

    @Override
    public void request() {
        specificRequest();
    }
}
