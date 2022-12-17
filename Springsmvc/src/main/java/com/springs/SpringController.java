package com.springs;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class SpringController {
		@RequestMapping(value="/hi")
	public String hello() {
		return "home";
	}
}
