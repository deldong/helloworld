package com.xueqiu.mvnbook.helloworld;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by dongzheng on 2017/3/17.
 */
public class HelloWorldTest {

    public HelloWorldTest() {

    }


    @Test
    public void testSayHello(){
        HelloWorld hw = new HelloWorld();
        String result = hw.sayHello();
        assertEquals("Hello Maven", result);
    }

    @Test
    public void testSayJenkins(){
        HelloWorld hw = new HelloWorld();
        String jenkins = hw.sayJenkins();
        assertEquals("Hello Jenkin", jenkins);
    }

    @Test
    public void testOne(){
        HelloWorld hw = new HelloWorld();
        String one = hw.sayOne();
        assertEquals("One", one);
    }

    @Test
    public void testTwo(){
        HelloWorld hw = new HelloWorld();
        String two = hw.sayOne();
        assertEquals("Two", two);
    }

}
