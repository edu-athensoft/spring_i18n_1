package com.athensoft.i18n.controller;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller   
@RequestMapping()  
public class ProductController {
	

	  @RequestMapping("product")
		public ModelAndView showPage(){
	        ModelAndView mov=new ModelAndView();  
	          System.out.println("123123");
	    	mov.setViewName("product");  
	        return mov;  
		}
	
	
}
