package com.example.cloundconsume.controller;

import com.example.cloundconsume.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: mzs
 * @Description:()
 * @Date: 2019/4/10 0010 10:10
 */
@RestController
public class TestController {
    @Autowired
    TestService helloService;

    @RequestMapping(value = "/hi")
    public String hi(@RequestParam String name)
    {
        return helloService.hiService(name);
    }

}
