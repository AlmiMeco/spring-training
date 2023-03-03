package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // <-- controller created { Bean Created & registered under "Handler Mapping" }
public class HomeController {


    @RequestMapping("/home")  // <-- end-point created
    public String home() {
        return "home.html";      // <-- returns .html file
    }

    @RequestMapping("/")          // <-- default mapping / landing page (fex: www.facebook.com/)
    public String getDefault() {
        return "home.html";
    }

    @RequestMapping({"/upload", "/create"})  // <-- multiple url suffixes (/upload & /create) point -> to ONE file
    public String getPolyEndPoint() {
        return "home.html";
    }

}
