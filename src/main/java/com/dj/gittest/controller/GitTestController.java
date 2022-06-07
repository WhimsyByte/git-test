package com.dj.gittest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName GitTestController.java
 * @Description TODO
 * @createTime 2022年06月07日 17:40:00
 */
@RestController
public class GitTestController {
    @GetMapping("/hello")
    public String hello() {
        System.out.println("hello git~~");
        System.out.println("hello git~~~");
        System.out.println("hello git~~~~");
        System.out.println("hello git~~~~~");
        System.out.println("hello dev~~~~~~");
        return "hello git~~";
    }
}
