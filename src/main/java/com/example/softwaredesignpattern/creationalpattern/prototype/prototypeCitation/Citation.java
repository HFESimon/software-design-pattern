package com.example.softwaredesignpattern.creationalpattern.prototype.prototypeCitation;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author wenjing.zsm
 * @version 1.0
 * @title:
 * @description:
 * @since 2022/4/8 2:16 下午
 */

@Data
@AllArgsConstructor
public class Citation implements Cloneable{

    private String name;
    private String info;
    private String company;

    public void diaplay() {
        System.out.println("citation info: " + name + " " + info + " " + company);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        System.out.println("citation clone success");
        return super.clone();
    }
}
