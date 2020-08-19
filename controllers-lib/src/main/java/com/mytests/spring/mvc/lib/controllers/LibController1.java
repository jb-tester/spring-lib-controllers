package com.mytests.spring.mvc.lib.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * *
 * <p>Created by irina on 17.08.2020.</p>
 * <p>Project: spring-lib-controllers</p>
 * <p>This controller defines the mappings that should be available in all projects that uses this module as a library</p>
 * *
 */
@RestController
public class LibController1 {

    /**
     * @return the text to display when the get request is performed on '/libpath1'  path
     */
    @RequestMapping(path = "/libpath1", method = RequestMethod.GET)
    public String lib1() {
        return "lib1: from library";
    }
}
