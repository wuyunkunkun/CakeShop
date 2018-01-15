package com.catCake.cakeonline.user.controller;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.catCake.cakeonline.user.service.userService;
@Controller
@RequestMapping("user")
public class userController {
	
		@Resource
		private userService userservice ;
		
		//login
		@RequestMapping("/login")
		public String doLogin(@RequestParam("email")String email,@RequestParam("password")String password,Model model,HttpServletRequest request)   {
			int list=this.userservice.doLogin(email,password,request);
			model.addAttribute("emaila", email);
			model.addAttribute("pswds", password);
			if(list != 0) {
				return "products";
			}else {
				return "account";
			}
			
		}
		
		//申请账号
		@RequestMapping("/account")
		public String setHao(@RequestParam("name")String a ,@RequestParam("sex")String b ,@RequestParam("email1")String c,@RequestParam("pswd")String d,@RequestParam("age")int e ){
			this.userservice.setHao(a, b, c, d,e);
			return "index" ;
		}
		//保存用户的意见反馈
		@RequestMapping("/idea")
		public String getIdea(@RequestParam("userName")String userName,@RequestParam("userEmail")String userEmail,@RequestParam("userPhone")String userPhone,@RequestParam("userIdea")String userIdea) {
		this.userservice.getIdea(userName, userEmail, userPhone, userIdea);
			return  "index";
		}
		
		
}
