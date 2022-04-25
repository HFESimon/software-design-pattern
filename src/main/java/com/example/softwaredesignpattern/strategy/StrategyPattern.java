package com.example.softwaredesignpattern.strategy;

import com.example.softwaredesignpattern.strategy.concretestrategy.ConcreteStrategyA;
import com.example.softwaredesignpattern.strategy.concretestrategy.ConcreteStrategyB;

/**
 * @author wenjing.zsm
 * @version 1.0
 * @title:
 * @description:
 * @date 2021/12/2 3:58 下午
 */
public class StrategyPattern {
    public static void main(String[] args) {
        Context c = new Context();
        Strategy s = new ConcreteStrategyA();
        c.setStrategy(s);
        System.out.println(c.strategyMethod());
        System.out.println("-----------------");
        s = new ConcreteStrategyB();
        c.setStrategy(s);
        System.out.println(c.strategyMethod());
    }
}
