package com.kdh.rest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import springfox.documentation.annotations.ApiIgnore;

@ApiIgnore
@Controller
public class SwgaggerController {

    @RequestMapping
    public String redirect(){
        return "redirect:swagger-ui.html";
    }
}
