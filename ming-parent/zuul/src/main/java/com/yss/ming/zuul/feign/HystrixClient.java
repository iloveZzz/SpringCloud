package com.yss.ming.zuul.feign;

import com.yss.ming.zuul.hystrix.HystrixClientFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "ming-web",fallbackFactory = HystrixClientFallback.class)
public interface HystrixClient {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String test();
}
