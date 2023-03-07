package com.cydeo.controller;

import com.cydeo.model.Mentor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@RequestMapping("/mentor")
@Controller
public class MentorController {

    @GetMapping("/register")
    public String register(Model model){

        List<String> batchList = Arrays.asList("JD1", "JD2", "JD3", "JD4", "JD5");
        model.addAttribute("batchList", batchList);

        model.addAttribute("mentor", new Mentor());

        return "mentor/register";
    }

    @PostMapping("/confirm")
    public String submitAction(){

        return "mentor/confirmation";
    }
    

}
