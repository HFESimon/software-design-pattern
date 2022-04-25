package com.example.softwaredesignpattern.creationalpattern.singleton.singletonlazy;

import java.util.Objects;

/**
 * @author wenjing.zsm
 * @version 1.0
 * @title:
 * @description:
 * @since 2022/2/22 11:44 下午
 */
class President {
    private static volatile President instance = null;

    /**
     * private避免类在外部被实例化
     */
    private President() {
        System.out.println("产生一个总统.");
    }


    public static synchronized President getInstance() {
        //在getInstance方法上加同步
        if (Objects.isNull(instance)) {
            instance = new President();
        } else {
            System.out.println("已经有一个总统，不能产生新总统.");
        }

        return instance;
    }

    public void getName(){
        System.out.println("我是美国总统：特朗普");
    }
}
