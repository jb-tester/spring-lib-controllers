package com.mytests.spring.mvc.lib.baseclasses;

import org.springframework.web.bind.annotation.GetMapping;

public interface LibInterfaceController {

    @GetMapping("/libpath2/test1")
    String test1();
}
