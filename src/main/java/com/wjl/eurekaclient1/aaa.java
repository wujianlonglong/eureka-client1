package com.wjl.eurekaclient1;

import com.wjl.eurekaclient1.feigns.TestFeign;
import org.springframework.stereotype.Component;

@Component
public class aaa implements TestFeign {
    @Override
    public String test() {
        return "hystrix is opening";
    }
}
