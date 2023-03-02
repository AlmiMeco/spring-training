package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {

    @RequestMapping("/welcome")
    public String dynamicHomePage(Model model){
        model.addAttribute("name", "Cydeo");
        model.addAttribute("name2", "Almi");
        return "student/welcome";
    }



}
