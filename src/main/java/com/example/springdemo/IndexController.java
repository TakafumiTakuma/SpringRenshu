package com.example.springdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class IndexController {

    @RequestMapping(value ="/")

    public ModelAndView index(ModelAndView mav) {
        mav.setViewName("index");
//        mav.addObject("msg","フォームを送信してください。");
        return mav;
    }

    @RequestMapping(value="/other")

    public String other() {

        return "redirect:/";
    }

    @RequestMapping(value="/home")
    public String home(){
        return "forward:/";
    }

}

