// 2023.11.22 - Spring Boot를 활용한 웹 개발 입문 - RequestMapping과 URI 실습
package dev.hyunsang.controllerexperience.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @RequestMapping(value = "/paid")
    public String getPaidUser() {
        return "I'm a paid user.";
    }

    @RequestMapping(value = "/enterprise")
    public String getEnterpriseUser() {
        return "I'm a enterprise user.";
    }
}
