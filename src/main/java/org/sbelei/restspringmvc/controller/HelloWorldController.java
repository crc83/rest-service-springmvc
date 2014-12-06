package org.sbelei.restspringmvc.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {

	@RequestMapping(value = "/hello", produces = {MediaType.APPLICATION_JSON_VALUE})
	public @ResponseBody Customer hello(
			@RequestParam(value = "name", required = false, defaultValue = "World") String name,
			Model model) {
		Customer customer = new Customer();
		customer.setName(name);
		return customer;
	}

}
