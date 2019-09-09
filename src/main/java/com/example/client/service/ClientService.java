package com.example.client.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * create by dely on 2019-09-09
 **/

@FeignClient
public interface ClientService {

    @GetMapping("/pro/con")
    String proCon();
}
