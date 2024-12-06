package com.tutorial.medium,controllers;

import org.springframework.sterotype.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;





@Controller
public class DemoController {
 
    @RequestMapping(value="/index.html", method = RequestMethod.GET)
    @ResponseBody
    public String index(){
        return "Your first Return";
    }
}
