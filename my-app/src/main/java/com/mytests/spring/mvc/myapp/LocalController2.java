package com.mytests.spring.mvc.myapp;

import com.mytests.spring.mvc.lib.baseclasses.LibBaseController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * *
 * <p>Created by irina on 19.08.2020.</p>
 * <p>Project: spring-lib-controllers</p>
 * *
 */
@RestController
public class LocalController2 extends LibBaseController {

    @RequestMapping("/local2")
    public String local() {
        return "lib2 local";
    }
}
