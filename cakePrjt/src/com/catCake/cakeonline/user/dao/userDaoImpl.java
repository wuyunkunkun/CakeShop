package com.catCake.cakeonline.user.dao;

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

import com.catCake.cakeonline.entity.Cart;
import com.catCake.cakeonline.entity.Lists;
import com.catCake.cakeonline.entity.Login;
import com.catCake.cakeonline.entity.User;
import com.catCake.cakeonline.entity.UserIdea;
@Repository
public class userDaoImpl {
	@Resource
	private SessionFactory sessionfactory ;
	
	//登录
	public int doLogin(@RequestParam("email")String email,@RequestParam("password")String password,HttpServletRequest request)  throws ServletException, IOException {
		String hql="from User";
		//创建一个session来存放用户的登录信息
		HttpSession session1 = request.getSession();
		Session session = sessionfactory.openSession();
		Transaction tx = session.beginTransaction();
		Query query = session.createQuery(hql);
		List<User> list = query.list();
		int a = 0 ;
		for(User user :list) {
			if(email.equals(user.getEmail())) {
				if(password.equals(user.getPassword())){
					//将用户登录的信息存入login
					Login login = new Login();
					DateFormat df2 = DateFormat.getDateTimeInstance();
					login.setTime(df2.format(new Date()));
					login.setUser(user);
					session.save(login);
					a = user.getUserId() ;
					session1.setAttribute("userLogin",user);
					tx.commit();
					return a ;	
				}
			}
		}
		return 0 ;
	}

	//申请账号
	public void setHao(@RequestParam("name")String a,@RequestParam("sex")String b ,@RequestParam("email1")String c,@RequestParam("pswd")String d,@RequestParam("age")int e) {
		Session session  = sessionfactory.openSession();
		Transaction tran = session.beginTransaction();
		User user = new User() ;
		user.setUserName(a);
		user.setSex(b);
		user.setEmail(c);
		user.setPassword(d);
		user.setAge(e);
		session.save(user);
		tran.commit();
	}
	//保存用户的意见反馈
	public void getIdea(@RequestParam("userName")String userName1,@RequestParam("userEmail")String userEmail,@RequestParam("userPhone")String userPhone,@RequestParam("userIdea")String userIdea) {
		Session session  = sessionfactory.openSession();
		Transaction tran = session.beginTransaction();
		UserIdea user=new UserIdea();
		user.setUserName(userName1);
		user.setUserEmail(userEmail);
		user.setUserIdea(userIdea);
		user.setUserPhone(userPhone);
		session.save(user);
		tran.commit();
	}
	//订单：
	public void getList(HttpServletRequest request) {
		HttpSession session=request.getSession();
		User usera = (User)session.getAttribute("userLogin");
		Session session1 = sessionfactory.openSession();
		Transaction tran = session1.beginTransaction();
		String hql="from Cart where user =:name";
		Query query = session1.createQuery(hql);
		query.setParameter("name",usera);
		List<Cart> list = query.list();
		for(Cart cart:list) {
			Lists a = new Lists();
			a.setCake(cart.getCake());
			a.setNum(cart.getNum());
			a.setUser(usera);
		}
		
		
	}

}
