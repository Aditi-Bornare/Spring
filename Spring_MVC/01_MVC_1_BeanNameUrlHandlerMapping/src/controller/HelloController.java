package controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class HelloController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception 
	{
//		Receive the request from jsp page
		String nm=request.getParameter("name");
		
//		Create Map object and in that object we can put our required output
		Map m= new HashMap();
		m.put("msg", "Hello Using BeanNameUrlHandlerMapping "+nm);
		
//		Now we send that Map object by using ModelAndView so create object of this class
		
		ModelAndView mav= new ModelAndView("success",m);
		
//		And finally return ModelAndView object to DispatcherServlet
		
		return mav;
	}

}
