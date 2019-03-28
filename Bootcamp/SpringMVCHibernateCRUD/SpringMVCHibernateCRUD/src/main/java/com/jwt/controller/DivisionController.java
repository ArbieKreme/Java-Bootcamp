package com.jwt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;

@Controller
public class DivisionController {

    @RequestMapping(value = "/division")
    private ModelAndView showDivisions(ModelAndView model)throws IOException{

        model.setViewName("division");

        return model;
    }

}
