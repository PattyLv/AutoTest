package com.demo.testng.parameter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * @author Patty
 * @version 1.0
 * @date 2020/6/6 15:25
 * 描述：DataProvider与Test方法在同一个class中
 */
public class DataPro {
    // DataProvide 作为数据提供者，提供几组数组，则引用他的test方法就会执行几次
    @DataProvider(name = "DataProvider")
    public Object[][] DataProviders() {
        Object[][] obj = new Object[][]{{"A", "A1"}, {"B", "B1"}, {"C", "C1"}};
        return obj;
    }

    @Test(dataProvider = "DataProvider")
    public void DataProviderShow(String data1, String data2) {
        System.out.println("result：" + data1 + data2);
    }
}