package com.mytests.spring.mvc.myapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * *
 * <p>Created by irina on 19.08.2020.</p>
 * <p>Project: spring-lib-controllers</p>
 * *
 */
@RestController
@RequestMapping("/local1")
public class LocalStandaloneController {

    @GetMapping(value = "/foo" + "bar")
    public String m0() {
        return "local m0";
    }
    @GetMapping(value = "/foobar/boo")
    public String m1() {
        return "local m1";
    }

    @GetMapping(value = "/")
    public String home() {
        return "local home";
    }
}
