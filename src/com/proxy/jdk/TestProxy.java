package com.proxy.jdk;

/**
 * @author lili.yue
 * @description:
 * @date 2017/9/23
 */
public class TestProxy {

    public static void main(String[] args)  {

        try {
            Zhangsan zhangsan = new Zhangsan();
            zhangsan.findLove();
        } catch (Exception e) {
            System.out.printf(e.toString());
        }

       /* Person object = (Person)new Meipo().getInstance(new Zhangsan());

        object.findLove();*/
    }

}
