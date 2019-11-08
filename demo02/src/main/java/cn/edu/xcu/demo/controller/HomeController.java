package cn.edu.xcu.demo.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/toMain")
	public String toMain() {
		return "main";
	}
	@RequestMapping("/toTestMain")
	public String toTestMain() {
		return "testMain";
	}
}
