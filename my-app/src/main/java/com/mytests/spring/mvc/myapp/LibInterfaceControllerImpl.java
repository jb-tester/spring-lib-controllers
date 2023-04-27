package com.mytests.spring.mvc.myapp;

import com.mytests.spring.mvc.lib.baseclasses.LibInterfaceController;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LibInterfaceControllerImpl implements LibInterfaceController {
    @Override
    public String test1() {
        return "for libpath2/test1";
    }
}
