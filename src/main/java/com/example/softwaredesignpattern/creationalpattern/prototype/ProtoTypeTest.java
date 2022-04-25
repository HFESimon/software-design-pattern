package com.example.softwaredesignpattern.creationalpattern.prototype;

import java.util.Objects;

/**
 * @author wenjing.zsm
 * @version 1.0
 * @title:
 * @description:
 * @since 2022/4/8 1:58 下午
 */
public class ProtoTypeTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        RealizeType obj1 = new RealizeType();
        RealizeType obj2 = (RealizeType) obj1.clone();

        System.out.println("obj1 == obj2 ?: " + Objects.equals(obj1, obj2));
    }
}
