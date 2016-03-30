package com.s3corp.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class HomeController {

	@RequestMapping(method = RequestMethod.GET)
    public String getIndexPage() {
      //  model.addAttribute("greeting", "Hello World from Spring 4 MVC");
        return "index";
    }
}
