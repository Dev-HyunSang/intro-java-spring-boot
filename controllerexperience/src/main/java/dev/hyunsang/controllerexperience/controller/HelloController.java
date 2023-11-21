// 2023.11.21 - Spring Boot를 활용한 웹 개발 입문 - 컨트롤러의 구현 실습
package dev.hyunsang.controllerexperience.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping(value = "/")
    public String Hello() {
        return "Hello";
    }
}