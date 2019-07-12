package com.bw.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bw.entity.User;
import com.bw.service.ServiceInter;

@Controller
public class userController {
	@Autowired
	ServiceInter serviceInter;
	
	@RequestMapping("list")
	public String list(Model model) {
		List<User> userList=serviceInter.getUserList();
		
		return "list";
	}
}
