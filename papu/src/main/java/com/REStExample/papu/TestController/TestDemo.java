package com.REStExample.papu.TestController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Hurre on 7/14/2018.
 */


@RestController
@RequestMapping(value = "/")
public class TestDemo {
    @RequestMapping(value = "/")
    public String testing()
    {
        return "welcome";
    }
}
