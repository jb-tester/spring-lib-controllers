package com.mytests.spring.mvc.lib.baseclasses;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * *
 * <p>Created by irina on 19.08.2020.</p>
 * <p>Project: spring-lib-controllers</p>
 * *
 */
//@RestController
@RequestMapping("/libpath2")
public class LibBaseController {

    @RequestMapping("/")
    public String home() {
        return "base lib2";
    }
}
