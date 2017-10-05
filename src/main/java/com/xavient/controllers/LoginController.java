package com.xavient.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.xavient.model.Login;

@RestController
public class LoginController {

	public LoginController() {
		// TODO Auto-generated constructor stub
	}

	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

	@RequestMapping(value = "/validateLogin", method = RequestMethod.POST)
	public String validateLogin(@ModelAttribute("login") Login login) {
		logger.info("Inside validateLogin method in LoginController");
		String success = "";
		return success;
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView login() {
		ModelAndView mv = new ModelAndView("index");
		return mv;
	}

}
