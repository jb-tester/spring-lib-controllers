package com.mytests.spring.mvc.myapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * *
 * <p>Created by irina on 19.08.2020.</p>
 * <p>Project: spring-lib-controllers</p>
 * *
 */
@RequestMapping("/local3")
public class Local3BaseController {
    @GetMapping("/")
    @ResponseBody
    public String local3home() {
        return "local3 home";
    }
}
