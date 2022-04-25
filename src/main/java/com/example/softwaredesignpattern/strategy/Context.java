package com.example.softwaredesignpattern.strategy;

/**
 * @author wenjing.zsm
 * @version 1.0
 * @title:
 * @description: 策略环境类
 * @date 2021/12/2 3:08 下午
 */
public class Context {

    private Strategy strategy;

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public String strategyMethod() {
        return strategy.strategyMethod();
    }
}
