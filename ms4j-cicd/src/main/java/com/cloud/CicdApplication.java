package com.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * author: zfan
 * date: 2023/3/30
 */
@SpringBootApplication
public class CicdApplication {

    public static void main(String[] args) {
        SpringApplication.run(CicdApplication.class);
    }

    @RestController
    public static class MyTest {
        @GetMapping("/test")
        public String test(){
            return "test";
        }
    }
}
