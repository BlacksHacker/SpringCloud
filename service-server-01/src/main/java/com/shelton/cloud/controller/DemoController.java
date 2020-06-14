package com.shelton.cloud.controller;

import com.shelton.cloud.dto.License;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {

    @RequestMapping( value = "/hello", method = RequestMethod.GET)
    @ResponseBody
    public License sayHello(){
        System.out.println("yes hello");
        return new License().withProductName("hello");
    }
}
