package com.example.softwaredesignpattern.strategy.concretestrategy;

import com.example.softwaredesignpattern.strategy.Strategy;

/**
 * @author wenjing.zsm
 * @version 1.0
 * @title:
 * @description: 具体策略B
 * @date 2021/12/2 2:47 下午
 */
public class ConcreteStrategyB implements Strategy {

    @Override
    public String strategyMethod() {
        return "具体策略B的策略方法被访问！";
    }
}
