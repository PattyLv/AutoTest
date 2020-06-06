package com.demo.testng;

import org.testng.annotations.Test;

/**
 * @author Patty
 * @version 1.0
 * @date 2020/6/6 15:32
 * 描述：多线程测试,没有关联的用例可以使用多线程减少执行时间
 */
public class MuitiThreadOnAnnotion {
    /**
     * @Test(invocationCount = 10,threadPoolSize = 3) 3个线程同时运行，共执行10次
     */
    @Test(invocationCount = 10,threadPoolSize = 3)
    public void test() {
        System.out.println(1);
        System.out.printf("Thrad Id : %s%n",Thread.currentThread().getId());
    }

}
