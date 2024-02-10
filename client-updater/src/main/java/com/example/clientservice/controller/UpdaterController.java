package com.example.clientservice.controller;

import com.example.clientservice.feignClient.FeignClientService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@AllArgsConstructor
@RestController
@RequestMapping("/api/update")
public class UpdaterController {
    private final FeignClientService feignClientService;

    @GetMapping
    public String checkLoadBalance() {
        return feignClientService.checkLoadBalance();
    }
}
