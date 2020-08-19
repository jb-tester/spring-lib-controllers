package com.mytests.spring.mvc.myapp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * *
 * <p>Created by irina on 19.08.2020.</p>
 * <p>Project: spring-lib-controllers</p>
 * *
 */
@RestController
public class Local3Controller3 extends Local3BaseController {

    @RequestMapping("/m1")
    public String m1() {
        return "local3: m1";
    }  
}
