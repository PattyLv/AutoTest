package com.demo.testng;

import org.testng.annotations.Test;

import java.util.concurrent.ExecutionException;

/**
 * @author Patty
 * @version 1.0
 * @date 2020/6/6 14:12
 * 描述：TestNG依赖测试
 */
public class DependTest {
    @Test
    public  void Method1(){
        throw  new  RuntimeException();
       // System.out.println("这里是方法1");
    }
    @Test(dependsOnMethods = {"Method1"})
    public  void Method2(){
        System.out.println("这里是方法2");
    }
}
