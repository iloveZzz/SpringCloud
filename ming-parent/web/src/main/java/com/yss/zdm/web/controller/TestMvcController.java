package com.yss.zdm.web.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RefreshScope
public class TestMvcController {
    @Value("${profile}")
    private String path;
    @Value("${eureka.name}")
    private String profile;
    @RequestMapping("/")
    @ResponseBody
    public String test(){
        System.out.println(path);
        System.out.println(profile);
        return path;
    }
}
