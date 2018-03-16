package com.wjl.eurekaclient1;

public class SingleTest {
    private SingleTest(){}

    private static class SingleHome{
        private static SingleTest singleTest=new SingleTest();
    }

    public static SingleTest getSingleTest(){
        return SingleHome.singleTest;
    }
}
