package com.jk.stockmarket.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class TestJQueryController {

	@RequestMapping("/testjq")
	public String hello(Model model) {
		// SearchResults searchResults =
		// twitter.searchOperations().search(search);
		// List<Tweet> tweets = searchResults.getTweets();
		// model.addAttribute("tweets", tweets);
		// model.addAttribute("search", search);
		model.addAttribute("message", "testjq");
		return "testJQuery";
	}

	@RequestMapping(value = "/postSearch", method = RequestMethod.POST)
	public String postSearch(HttpServletRequest request, RedirectAttributes redirectAttributes) {
		String search = request.getParameter("search");
		
		if (search.toLowerCase().contains("struts")) {
			redirectAttributes.addFlashAttribute("error", "Try using spring instead!");
			return "error";
			}
		
		redirectAttributes.addAttribute("search", search);
		return "redirect:result";
	}
}
