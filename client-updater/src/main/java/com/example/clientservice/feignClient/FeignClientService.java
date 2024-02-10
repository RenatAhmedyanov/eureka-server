package com.example.clientservice.feignClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "client-service")
public interface FeignClientService {
    @GetMapping("/api/client/test")
    String checkLoadBalance();
}
