package com.demo.testng.parameter;

import org.testng.annotations.Test;

/**
 * @author Patty
 * @version 1.0
 * @date 2020/6/6 15:29
 * 描述：DataProvider与Test方法不在同一个class中
 */
public class DataPra2 {
    @Test(dataProvider = "DataProvider", dataProviderClass =com.demo.testng.parameter.DataPro.class )
    public void DataProviderShow(String data1, String data2) {
        System.out.println("result：" + data1 + data2);
    }
}
