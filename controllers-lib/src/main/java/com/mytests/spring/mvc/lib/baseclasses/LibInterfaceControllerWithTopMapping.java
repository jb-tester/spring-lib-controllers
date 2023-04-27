package com.mytests.spring.mvc.lib.baseclasses;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/libpath3")
public interface LibInterfaceControllerWithTopMapping {

    @GetMapping("/test1")
    String test1();
}
