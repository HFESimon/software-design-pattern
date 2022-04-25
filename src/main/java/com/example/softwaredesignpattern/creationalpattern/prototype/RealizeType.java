package com.example.softwaredesignpattern.creationalpattern.prototype;

/**
 * @author wenjing.zsm
 * @version 1.0
 * @title:
 * @description:
 * @since 2022/4/8 11:27 上午
 */
class RealizeType implements Cloneable{

    RealizeType() {
        System.out.println("具体原形创建成功!");
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        System.out.println("具体原形复制成功!");
        // 浅克隆
        return super.clone();
    }
}
