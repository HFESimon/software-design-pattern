package com.example.softwaredesignpattern.creationalpattern.singleton.singletonhungry;

/**
 * @author wenjing.zsm
 * @version 1.0
 * @title:
 * @description:
 * @since 2022/4/8 10:51 上午
 */
class Piggy {
    private static final Piggy INSTANCE = new Piggy();

    private Piggy() {}

    private static Piggy getInstance() {
        return Piggy.INSTANCE;
    }
}
