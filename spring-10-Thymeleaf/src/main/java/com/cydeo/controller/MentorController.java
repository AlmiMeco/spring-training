package com.cydeo.controller;

import com.cydeo.model.Mentor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/mentor")
@Controller
public class MentorController {

    @GetMapping("/register")
    public String register(Model model){

        model.addAttribute("mentor", new Mentor());

        return "mentor/register";
    }

}
