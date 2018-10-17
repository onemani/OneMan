package com.yyci.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JsDataCheckController {

    @RequestMapping("/getIndex")
    public String getIndex(){
        return "js-data-check";
    }
}
