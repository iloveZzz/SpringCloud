package com.yss.ming.zuul.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "ming-web",fallback = ItestMVCService.HystrixClientFallback.class)
public interface ItestMVCService {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String test();
    @Component
    static class HystrixClientFallback implements ItestMVCService {
        @Override
        public String test() {
            return "cccc";
        }
    }
}
