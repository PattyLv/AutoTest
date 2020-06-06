package com.demo.testng;

import org.testng.annotations.*;

/**
 * BeforeSuite,BeforeSuite,BeforeClass,AfterClass,BeforeMethod,AfterMethod,Test注解执行顺序
 *1，beforeSuite
 *2，beforeClass
 *3，beforeMethod
 *4，test
 *5，afterMethod
 *6，afterClass
 *7，afterSuite
 */
public class BasicAnnotations {
    @BeforeSuite
    public void BeforeSuite(){
        System.out.println("beforeSuite");
    }
    @AfterSuite
    public void AfterSuite(){
        System.out.println("afterSuite");
    }
    @BeforeClass
    public void BeforeClass(){
        System.out.println("beforeClass");
    }
    @AfterClass
    public void AfterClass(){
        System.out.println("afterClass ");
    }
    @BeforeMethod
    public void BeforeMethod(){
        System.out.println("beforeMethod ");
    }
    @AfterMethod
    public void AfterMethod(){
        System.out.println("afterMethod ");
    }
    @Test
    public void Test(){
        System.out.println("test ");
    }

}
