package com.bw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
	@RequestMapping("get")
	@ResponseBody
	public void get() {
		System.out.println("hello world");
	}
}
