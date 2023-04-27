package com.mytests.spring.mvc.myapp;

import com.mytests.spring.mvc.lib.baseclasses.LibInterfaceControllerWithTopMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LibInterfaceControllerWithTopMappingImpl implements LibInterfaceControllerWithTopMapping {
    @Override
    public String test1() {
        return "for libpath3/test1";
    }
}
