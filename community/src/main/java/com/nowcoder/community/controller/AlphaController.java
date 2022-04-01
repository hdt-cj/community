package com.nowcoder.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Locale;

@Controller
@RequestMapping("/alpha")
public class AlphaController {
    @RequestMapping(path ="/student" ,method = RequestMethod.POST)
    @ResponseBody
    public String savestudent(String name)
    {
        System.out.println(name);
        return name.toUpperCase(Locale.ROOT);
    }
}
