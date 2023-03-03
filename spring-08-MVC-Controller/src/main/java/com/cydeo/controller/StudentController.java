package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {

    @RequestMapping("/student")
    public String getWelcomePage() {
        return "student/welcome.html"; // <-- must give exact location ( if not directly under "static" directory )
    }


}
