package com.yyci.restcontroller;

import com.yyci.form.Employee;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JsDataCheckRestController {

    @RequestMapping(value = "/submit/data",method = RequestMethod.POST)
    public Employee dataCheck(Employee employee){
        return employee;
    }
}
