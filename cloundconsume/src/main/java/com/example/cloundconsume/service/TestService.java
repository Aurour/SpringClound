package com.example.cloundconsume.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Auther: mzs
 * @Description:()
 * @Date: 2019/4/10 0010 10:11
 */
@Service("TestService")
public class TestService {
    @Autowired
    RestTemplate restTemplate;

    public String hiService(String name)
    {
        //可以以实体进行返回
        ResponseEntity<Object> oentity = restTemplate.getForEntity("http://SERVICE-HI/hi?name=" + name,Object.class);

        return restTemplate.getForObject("http://SERVICE-HI/hi?name=" + name, String.class);
    }

}
