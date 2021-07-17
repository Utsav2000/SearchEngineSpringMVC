package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchMVC {
	@RequestMapping("/home")
	public String home() {
		return "home";
	}

	@RequestMapping("/process")
	public RedirectView search(@RequestParam("str") String query) {
		RedirectView redirectView = new RedirectView();
		if(query.isBlank()) {
			redirectView.setUrl("home");
			return redirectView;
		}
		String url = "https://www.google.com/search?q=" + query;
		
		redirectView.setUrl(url);
		return redirectView;

	}
}
