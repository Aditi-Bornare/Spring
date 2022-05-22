package com.rspc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//Tomcat Jasper is responsible to convert jsp to servlet so add dependency from maven

@Controller
public class SecurityController {

	@RequestMapping("/")
	public String index() 
	{
		return "index.jsp";
	}
}
