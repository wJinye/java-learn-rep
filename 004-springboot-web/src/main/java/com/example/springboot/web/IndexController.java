package com.example.springboot.web;

import com.example.springboot.model.Student;
import com.example.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;
@Controller
public class IndexController {

    @Value("${mes}")
    private String mes;

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/index.do")
    public @ResponseBody Map getMsg(){
        Map m = new HashMap();
        m.put("s","Hello SpringBoot"+mes);
        return m;
    }

    @RequestMapping(value = "/index2.do")
    public ModelAndView getMsg2(Integer id){
        ModelAndView mv = new ModelAndView();
        Student s = studentService.queryStudentById(id);
        mv.addObject("s",s);
        mv.setViewName("index");
        return mv;
    }
}
