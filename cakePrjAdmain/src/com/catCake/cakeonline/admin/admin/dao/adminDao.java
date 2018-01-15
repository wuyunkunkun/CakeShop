package com.catCake.cakeonline.admin.admin.dao;

import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import com.catCake.cakeonline.admin.entity.Admin;
import com.catCake.cakeonline.admin.entity.Login;

@Repository
public class adminDao {
	@Resource
	private SessionFactory sessionfactory ;
	
	//登录
	public int doLogin(@RequestParam("adminName")String admin,@RequestParam("password")String password,HttpServletRequest request)  throws ServletException, IOException {
		String hql="from Admin";
		//创建一个session来存放用户的登录信息
		HttpSession session1 = request.getSession();
		
		Session session = sessionfactory.openSession();
		Transaction tx = session.beginTransaction();
		Query query = session.createQuery(hql);
		List<Admin> list = query.list();
		int a = 0 ;
		for(Admin user :list) {
			if(admin.equals(user.getAdminName())) {
					if(password.equals(user.getPassword())){
						//将用户登录的信息存入login
						Login login = new Login();
						DateFormat df2 = DateFormat.getDateTimeInstance();
						login.setTime(df2.format(new Date()));
						login.setUser(user);
						session.save(login);
						a = user.getAdminId();
						session1.setAttribute("userLogin",user);
						tx.commit();
						return a ;	
					}
				}
			}
			return 0 ;
		}
}
