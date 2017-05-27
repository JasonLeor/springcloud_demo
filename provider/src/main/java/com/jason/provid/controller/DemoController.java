package com.jason.provid.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by suliguo on 2017/5/24.
 */
@RestController
public class DemoController {
    @RequestMapping(value = "add",method = RequestMethod.GET)
    public Integer add(@RequestParam Integer num1,@RequestParam Integer num2){
        return num1+num2;
    }
}
