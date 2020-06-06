package com.demo.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

/**
 * 组测试方法分组测试
 */
public class GroupMethods {
    @Test(groups ="client")
    public void test1(){
     System.out.println("client");
    }
    @Test(groups = "server")
    public void test2(){
     System.out.println("server");
    }
    @BeforeGroups("server")
    public void test3(){
        System.out.println("服务端BeforeGroups");
    }
    @AfterGroups("server")
    public void test4(){
        System.out.println("服务端AfterGroups");
    }
    @BeforeGroups("client")
    public void test5(){
        System.out.println("客户端BeforeGroups");
    }
    @AfterGroups("client")
    public void test6(){
        System.out.println("客户端AfterGroups");
    }
}
