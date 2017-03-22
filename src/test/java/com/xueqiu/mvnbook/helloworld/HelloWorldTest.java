package com.xueqiu.mvnbook.helloworld;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * Created by dongzheng on 2017/3/17.
 */
public class HelloWorldTest {

    @Test
    public void testSayHello(){
        HelloWorld helloWorld = new HelloWorld();
        String result = helloWorld.sayHello();
        assertEquals("Hello Maven", result);
    }
}
