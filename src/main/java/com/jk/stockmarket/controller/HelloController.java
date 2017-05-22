package com.jk.stockmarket.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.social.twitter.api.SearchResults;
import org.springframework.social.twitter.api.Twitter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

//	@RequestMapping("/")
//	public String hello(@RequestParam(defaultValue = "world") String name, Model model) {
//		model.addAttribute("message", "Hello " + name);
//		return "resultPage";
//	}

	@Autowired
	private Twitter twitter;

	@RequestMapping("/hello")
	public String hello(@RequestParam(defaultValue = "world") String text, Model model) {
//		SearchResults searchResults = twitter.searchOperations().search(search);
//		String text = searchResults.getTweets().get(0).getText();
		model.addAttribute("message", text);
		return "resultPage";
	}

}
