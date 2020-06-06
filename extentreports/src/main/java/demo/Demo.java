package demo;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

/**
 * @author Patty
 * @version 1.0
 * @date 2020/6/6 16:15
 */
public class Demo {
    @Test
    public void Method1(){
        Assert.assertEquals(1,2);
    }
    @Test
    public void Method2(){
        Assert.assertEquals(1,1);
    }
    public void LogMethod(){
        Reporter.log("这是日志啦......");
        throw  new RuntimeException("这是一场啦....");
    }
}
