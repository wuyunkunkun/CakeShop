package com.catCake.cakeonline.admin.admin.controller;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.catCake.cakeonline.admin.admin.service.adminService;

@Controller
@RequestMapping("admin")
public class adminController {
	@Resource
	private adminService adminservice ;
	
	//µÇÂ¼
	@RequestMapping("/logina")
	public String doLogin(@RequestParam("adminName")String name,@RequestParam("password")String password,Model model,HttpServletRequest request)   {
		int list = 0;
		try {
			list = this.adminservice.doLogin(name,password,request);
		} catch (ServletException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		model.addAttribute("adminName", name);
		model.addAttribute("pswds", password);
		if(list != 0) {
			return "index";
		}else {
			return "login";
		}
	}
}
