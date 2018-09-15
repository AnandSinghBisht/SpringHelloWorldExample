package com.springwebproject.SpringWeb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * Created by Hurre on 9/15/2018.
 */

@Controller
public class WebController {

    @RequestMapping("/home")
    public String home()
    {
               return "index";
    }
}
