package com.wjl.eurekaclient1.feigns;

import com.wjl.eurekaclient1.aaa;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value="client2",fallback = aaa.class)
//@RequestMapping("test2")
public interface TestFeign {
    @RequestMapping(value="test2/test2",method= RequestMethod.GET)
    String test();
}
