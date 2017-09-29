package com.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author lili.yue
 * @description: 这就是代理类
 *  1： 需要被代理人 张三的个人信息
 * @date 2017/9/23
 */
public class Meipo  implements InvocationHandler {

    private Person target;


    // 接受获取张三的个人资料
    public Object getInstance(Person target) throws Exception {

        this.target = target;
        Class clas = target.getClass();
        Proxy.newProxyInstance(target.getClass().getClassLoader(),clas.getInterfaces(), this);
        return null;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.printf(" 你的性别是 ：" +  this.target.getSex());
        System.out.printf(" 现在开始海选 ：");
        this.target.findLove();

        System.out.printf(" 现在开始海选结束 ：");
        return null;
    }
}
