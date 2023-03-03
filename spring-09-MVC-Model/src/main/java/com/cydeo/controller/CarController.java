package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

/**
 * localhost:8080/info?make= {????}
 **/

@Controller
public class CarController {


    @RequestMapping("/info")
    public String carInfo(@RequestParam String make, Model model) {

        System.out.println(make); //                            <-- printing requested value to console

        model.addAttribute("make", make); //        <-- storing requested value as attribute

        List<String> listOfQueryParams = new ArrayList<>();//   <-- storing requested value as a List (fex: db)
        listOfQueryParams.add(make);

        return "car/car-info";
    }

    /* Now anything you search on webApp ( /info?make="...." ) will be passed onto {mapped} into this method */


    @RequestMapping("/info/{make}") // <-- param is defined by position (url-path)
    public String carInfo2(@PathVariable String make) {
        //variable is assigned to paramRequest (name != param : position == param)

        System.out.println(make);

        return "car/car-info";
    }

}
