// 2023.11.20 - SpringBoot를 활용한 웹 개발 입문 - 나의 첫 Spring Boot Application
package dev.hyunsang.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping(value = "/")
    public String hello() {
        return "<h1>Hello, Spring Boot!</h1>";
    }
}
