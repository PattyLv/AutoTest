package com.demo.testng.nestsTest;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
/**
 * 套件测试
 * 用配置文件的方式
 */

public class TestConfig {
    @BeforeSuite
    public void BeforeSuite(){
        System.out.println("BeforeSuite....");
    }

    @AfterSuite
    public void AfterSuite(){
        System.out.println("AfterSuite....");
    }
}
