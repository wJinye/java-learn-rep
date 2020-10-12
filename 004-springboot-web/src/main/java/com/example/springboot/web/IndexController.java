package com.example.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class IndexController {

    @RequestMapping(value = "/index.do")
    @ResponseBody
    public Map getMsg(){
        Map m = new HashMap();
        m.put("s","Hello SpringBoot");
        return m;
        //return "Hello SpringBoot";
    }
}
