package com.bit2016.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

// request mappig ( type + method )
@Controller
@RequestMapping( "/user" )
public class UserController {

	@RequestMapping( "/joinform" )
	public String joinForm(){
		return "/WEB-INF/views/joinform.jsp";
	}
	
	@ResponseBody
	@RequestMapping( value="/join", method=RequestMethod.POST )
	public String join(){
		return "join";
	}
	
}
