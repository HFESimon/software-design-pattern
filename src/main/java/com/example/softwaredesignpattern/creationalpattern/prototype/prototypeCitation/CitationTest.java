package com.example.softwaredesignpattern.creationalpattern.prototype.prototypeCitation;

/**
 * @author wenjing.zsm
 * @version 1.0
 * @title:
 * @description:
 * @since 2022/4/8 2:27 下午
 */
class CitationTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        Citation obj1 = new Citation("wenjing.zsm", "is a handsome programmer.", "from @come-future.com");
        obj1.diaplay();

        Citation obj2 = (Citation) obj1.clone();
        obj2.setName("Simon");
        obj2.diaplay();
    }
}
