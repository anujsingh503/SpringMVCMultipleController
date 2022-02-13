package com.javatpoint;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//Anuj Singh
//Doli singh
@Controller
public class HelloController1 {
@RequestMapping("/hello1")
	public String display()
	{
		return "viewpage1";
	}	
}
