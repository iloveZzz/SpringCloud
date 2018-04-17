package com.yss.ming.zuul.controller;

<<<<<<< HEAD
import com.yss.ming.zuul.feign.HystrixClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestMvcController {
    @Autowired
    private HystrixClient itestMVCService;
    @RequestMapping("/cc")
    public String getcc(){
        return itestMVCService.test();
    }
=======
public class TestMvcController {
>>>>>>> b8f979e8cf27601602f785f75b10b20a31694e73
}
