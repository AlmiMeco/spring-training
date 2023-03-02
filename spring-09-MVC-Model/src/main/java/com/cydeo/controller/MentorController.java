package com.cydeo.controller;

import com.cydeo.enums.Gender;
import com.cydeo.model.Mentor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MentorController {

    @RequestMapping("/mvcTASK")
    public String mvcTask(Model model){

        Mentor mentor1 = new Mentor(21, "Almi", "Meco", Gender.MALE);
        Mentor mentor2 = new Mentor(43, "Jared", "Smith", Gender.MALE);
        Mentor mentor3 = new Mentor(25, "Sarah", "Reynolds", Gender.FEMALE);

        model.addAttribute("name1", mentor1);
        model.addAttribute("name2", mentor2);
        model.addAttribute("name3", mentor3);


        return "mentor/mvcTask";
    }


}
