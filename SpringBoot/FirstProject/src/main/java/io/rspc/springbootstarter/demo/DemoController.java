package io.rspc.springbootstarter.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	@RequestMapping("/abc")
	public String show()
	{
		return "Shri Ganesh";
	}
}
