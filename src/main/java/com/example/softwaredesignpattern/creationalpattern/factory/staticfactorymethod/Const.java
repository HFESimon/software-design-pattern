package com.example.softwaredesignpattern.creationalpattern.factory.staticfactorymethod;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author wenjing.zsm
 * @version 1.0
 * @title:
 * @description:
 * @since 2022/4/11 3:31 下午
 */

@Getter
@AllArgsConstructor
public enum Const {

    PRODUCT_A(0),

    PRODUCT_B(1),

    PRODUCT_C(2),
    ;


    private Integer kind;
}
