package com.demo.testng.groups;

import org.testng.annotations.Test;

/**
 * @author Patty
 * @version 1.0
 * @date 2020/6/6 14:01
 * 描述： 组测试中的类分类测试
 */
public class GroupClass2 {
    @Test(groups = "teacher")
    public  void  Teacher(){
        System.out.println("这里是老师啦");
    }
}
