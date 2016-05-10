package com.hr.controllers;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

	private static final Logger logger = Logger.getLogger(LoginController.class);

	@RequestMapping(value = "")
	public String showIndex() {
		return "index";
	}
}
