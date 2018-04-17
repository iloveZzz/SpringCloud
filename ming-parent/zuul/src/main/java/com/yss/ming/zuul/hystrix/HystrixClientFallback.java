package com.yss.ming.zuul.hystrix;

import com.yss.ming.zuul.feign.HystrixClient;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class HystrixClientFallback implements FallbackFactory<HystrixClient> {
    @Override
    public HystrixClient create(Throwable cause) {
        return new HystrixClient(){

            @Override
            public String test() {
                System.out.println(cause.getMessage());
                cause.printStackTrace();
                return "触发了熔断机制！";
            }
        };
    }
}
