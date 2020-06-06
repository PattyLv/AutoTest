package com.demo.testng;

import org.testng.annotations.Test;

/**
 * @author Patty
 * @version 1.0
 * @date 2020/6/6 15:36
 * 描述TestNG超时测试
 */
public class TimeOutTest {
    @Test(timeOut = 3000)
    public void TestSuccess() throws InterruptedException {
        Thread.sleep(2000);
    }

    @Test(timeOut = 2000)
    public void TestFailed() throws InterruptedException {
        Thread.sleep(3000);
    }
}
