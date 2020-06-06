package com.demo.testng.parameter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * @author Patty
 * @version 1.0
 * @date 2020/6/6 14:21
 * 描述：TestNG参数化测试
 */
public class ParametersTest {
   @Test
   @Parameters({"name","age"})
    public void Method(String name,int age){
          System.out.println(name+"......"+age);
    }
}
