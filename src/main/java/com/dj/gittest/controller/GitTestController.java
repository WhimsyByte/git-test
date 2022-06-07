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
        System.out.println("hello master~~~~~");
        System.out.println("hello dev~~~~~~");
        //先在dev分支写,再合并到master,最后通过master提交到远程仓库
        System.out.println("hello push by master");
        return "hello git~~";
    }
}
