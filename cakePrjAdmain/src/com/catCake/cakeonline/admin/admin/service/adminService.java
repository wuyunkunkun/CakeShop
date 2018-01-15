package com.catCake.cakeonline.admin.admin.service;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestParam;

import com.catCake.cakeonline.admin.admin.dao.adminDao;

@Service
@Transactional(readOnly = true)
public class adminService {
	@Resource
	private adminDao adminDao ;
	
	//µÇÂ¼
	public int doLogin(@RequestParam("adminName")String admin,@RequestParam("password")String password,HttpServletRequest request)  throws ServletException, IOException {
		int list = 0;
		try {
			list = adminDao.doLogin(admin,password,request);
		} catch (ServletException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			return list;
	}
}
