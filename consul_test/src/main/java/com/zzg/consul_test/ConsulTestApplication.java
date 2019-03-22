package com.zzg.consul_test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class ConsulTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsulTestApplication.class, args);
    }

    @RequestMapping("/get")
    public String getStr(){
        return "hello world";
    }

}
