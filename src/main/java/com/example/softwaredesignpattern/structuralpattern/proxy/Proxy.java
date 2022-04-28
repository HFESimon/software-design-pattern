package com.example.softwaredesignpattern.structuralpattern.proxy;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Objects;

/**
 * @author wenjing.zsm
 * @version 1.0
 * @title:
 * @description:
 * @since 2022/4/28 3:06 下午
 */

@Component
public class Proxy implements Subject{

    @Resource
    private RealSubject realSubject;

    @Override
    public void request() {
        if (Objects.isNull(realSubject)) {
            realSubject = new RealSubject();
        }
        preRequest();
        realSubject.request();
        afterRequest();
    }

    private void preRequest() {
        System.out.println("handle method before request real subject...");
    }

    private void afterRequest() {
        System.out.println("handle method after request real subject...");
    }
}
