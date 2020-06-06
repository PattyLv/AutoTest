package com.demo.testng;

import org.testng.annotations.Test;

/**
 * 忽略测试，把方法忽略掉暂时不执行(enabled=false)
 */
public class IgnoreTest {
    @Test(enabled = false)
    public void Ignore(){

    }
}
