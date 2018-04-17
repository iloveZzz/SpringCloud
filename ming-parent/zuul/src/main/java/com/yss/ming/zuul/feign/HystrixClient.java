package com.yss.ming.zuul.feign;

<<<<<<< HEAD
import com.yss.ming.zuul.hystrix.HystrixClientFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "ming-web",fallbackFactory = HystrixClientFallback.class)
public interface HystrixClient {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String test();
=======
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
>>>>>>> b8f979e8cf27601602f785f75b10b20a31694e73
}
