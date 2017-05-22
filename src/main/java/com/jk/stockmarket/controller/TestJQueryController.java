package com.jk.stockmarket.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestJQueryController {

	@RequestMapping("/testjq")
	public String hello() {
//		SearchResults searchResults = twitter.searchOperations().search(search);
//		List<Tweet> tweets = searchResults.getTweets();
//		model.addAttribute("tweets", tweets);
//		model.addAttribute("search", search);
		return "testJQuery";
	}

}
