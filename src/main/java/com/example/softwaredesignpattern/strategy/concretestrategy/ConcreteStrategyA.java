package com.example.softwaredesignpattern.strategy.concretestrategy;

import com.example.softwaredesignpattern.strategy.Strategy;

/**
 * @author wenjing.zsm
 * @version 1.0
 * @title:
 * @description: 具体策略A
 * @date 2021/12/2 2:31 下午
 */

public class ConcreteStrategyA implements Strategy {

    @Override
    public String strategyMethod() {
        return "具体策略A的策略方法被访问！";
    }
}
