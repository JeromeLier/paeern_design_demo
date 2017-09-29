package com.proxy.jdk;

/**
 * @author lili.yue
 *   代理模式 依赖媒婆
 * @date 2017/9/23
 */
public class Zhangsan implements Person {


    private String sex = "woman";

    private String name = "zhangsan";


    @Override
    public void findLove() {
        System.out.printf("高富帅");
        System.out.printf("有房子有车子");
        System.out.printf("身高180");

    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
