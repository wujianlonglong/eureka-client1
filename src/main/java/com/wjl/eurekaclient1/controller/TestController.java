package com.wjl.eurekaclient1.controller;

import com.wjl.eurekaclient1.SingleTest;
import com.wjl.eurekaclient1.feigns.TestFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test1")
public class TestController {

    @Autowired
    TestFeign testFeign;

    @GetMapping("test1")
    public String test() {
        String test = testFeign.test();
        System.out.println(test);
        return test;
    }

    @GetMapping("singletest")
    public void singleTest(){
        SingleTest singleTest=SingleTest.getSingleTest();
        System.out.println(singleTest.hashCode());
    }

}
