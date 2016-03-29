package com.s3corp.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/items")
public class MainTemplateController {

	@RequestMapping(value="/home")
    public String getHomeTemplate() {
    	return "template/home";	
    }
	
	@RequestMapping(value="/about")
    public String getAboutTemplate() {
    	return "template/about";	
    }
	
	@RequestMapping(value="/blog")
    public String getBlogTemplate() {
    	return "template/blog";	
    }
	
	@RequestMapping(value="/contact")
    public String getContactTemplate() {
    	return "template/contact";	
    }
}
