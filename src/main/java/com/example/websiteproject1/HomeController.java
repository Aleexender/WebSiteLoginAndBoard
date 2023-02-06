package com.example.websiteproject1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @GetMapping(path = "/login")
    public String home() {
        return "login";
    }

    @GetMapping(path = "/signUp")
    public String home2() {
        return "signUp";
    }


    @GetMapping(path = "/signUp2")
    public ModelAndView home3(String id ) {
        ModelAndView modelAndView = new ModelAndView();

        modelAndView.setViewName("signUp");
        modelAndView.addObject("id", id);

        return modelAndView;
    }

}



