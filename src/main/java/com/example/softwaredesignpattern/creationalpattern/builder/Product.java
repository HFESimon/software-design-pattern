package com.example.softwaredesignpattern.creationalpattern.builder;

import lombok.Data;

/**
 * @author wenjing.zsm
 * @version 1.0
 * @title:
 * @description:
 * @since 2022/4/19 4:27 下午
 */

@Data
public class Product {

    private String partA;

    private String partB;

    private String partC;

    public void show() {
        // 显示产品特性
        System.out.println("show product:" + partA + "," + partB + "," + partC);
    }
}
