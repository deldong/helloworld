package com.xueqiu.mvnbook.helloworld;
/**
 * Created by dongzheng on 2017/3/17.
 */
public class HelloWorld {

    public String sayHello(){
        return "Hello Maven";
    }

    public String sayJenkins(){
        return "Hello Jenkins";
    }

    public String sayOne(){
        return "One";
    }

    public String sayTwo(){
        return "two";
    }

    public String sayThree(){
        return "three";
    }

    public static void main(String[] args) {
        System.out.print(new HelloWorld().sayHello());
    }

}
