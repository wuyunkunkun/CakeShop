package com.catCake.cakeonline.user.service;
import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestParam;

import com.catCake.cakeonline.user.dao.userDaoImpl;

@Service
@Transactional(readOnly = true)
public class userService {
	@Resource
	private userDaoImpl userDaoImpl ;
	
	//login
	public int doLogin(@RequestParam("email")String email,@RequestParam("password")String password,HttpServletRequest request) {
		int list = 0;
		try {
			list = userDaoImpl.doLogin(email,password,request);
		} catch (ServletException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			return list;
	}
	//申请账号
	public void setHao(@RequestParam("name")String a ,@RequestParam("sex")String b ,@RequestParam("email1")String c,@RequestParam("pswd")String d,@RequestParam("age")int e) {
		this.userDaoImpl.setHao(a, b, c, d,e);
	}
	//保存用户的意见反馈
	public void getIdea(@RequestParam("userName")String userName,@RequestParam("userEmail")String userEmail,@RequestParam("userPhone")String userPhone,@RequestParam("userIdea")String userIdea) {
		this.userDaoImpl.getIdea(userName, userEmail, userPhone, userIdea);
	}
			
}
