package com.catCake.cakeonline.cake.dao;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import com.catCake.cakeonline.entity.Cake;
import com.catCake.cakeonline.entity.Cart;
import com.catCake.cakeonline.entity.User;

@Repository

public class cakeDaoImpl {
	@Resource
	private SessionFactory sessionfactory ;
	//查找全部蛋糕
	public List<Cake> findAll(){
		String hql = "from Cake" ;
		Session session = sessionfactory.openSession();
		Query query = session.createQuery(hql);
		query.setFirstResult(1);
		query.setMaxResults(6);
		return query.list();
	}
	//搜索Cassata蛋糕
	public List<Cake> findCassata(){
		String hql = "from Cake as c where c.cakeType in(select typeId from CakeType as a where a.typeName='Cassata')" ;
		Session session = sessionfactory.openSession();
		Query query = session.createQuery(hql);
		query.setFirstResult(1);
		query.setMaxResults(6);
		return query.list();
	}
	
	//搜索Cheesecake蛋糕
		public List<Cake> findCheesecake(){
			String hql = "from Cake as c where c.cakeType in(select typeId from CakeType as a where a.typeName='Cheesecake')" ;
			Session session = sessionfactory.openSession();
			Query query = session.createQuery(hql);
			query.setFirstResult(1);
			query.setMaxResults(6);
			return query.list();
		}
		
	//搜索Coconut cake蛋糕
		public List<Cake> findCoconutcake(){
			String hql = "from Cake as c where c.cakeType in(select typeId from CakeType as a where a.typeName='Coconut cake')" ;
			Session session = sessionfactory.openSession();
			Query query = session.createQuery(hql);
			query.setFirstResult(1);
			query.setMaxResults(6);
			return query.list();
		}
	//搜索Cupcake蛋糕
		public List<Cake> findCupcake(){
			String hql = "from Cake as c where c.cakeType in(select typeId from CakeType as a where a.typeName='Cupcake')" ;
			Session session = sessionfactory.openSession();
			Query query = session.createQuery(hql);
			query.setFirstResult(1);
			query.setMaxResults(6);
			return query.list();
		}
	//搜索DeliciousCakes蛋糕
		public List<Cake> findDeliciousCakes(){
			String hql = "from Cake as c where c.cakeType in(select typeId from CakeType as a where a.typeName='Delicious Cakes')" ;
			Session session = sessionfactory.openSession();
			Query query = session.createQuery(hql);
			query.setFirstResult(1);
			query.setMaxResults(6);
			return query.list();
		}
	//搜索Gingerbread蛋糕
		public List<Cake> findGingerbread(){
			String hql = "from Cake as c where c.cakeType in(select typeId from CakeType as a where a.typeName='Gingerbread')" ;
			Session session = sessionfactory.openSession();
			Query query = session.createQuery(hql);
			query.setFirstResult(1);
			query.setMaxResults(6);
			return query.list();
		}
	//搜索MileCakes蛋糕
		public List<Cake> findMileCakes(){
			String hql = "from Cake as c where c.cakeType in(select typeId from CakeType as a where a.typeName='Mile Cakes')" ;
			Session session = sessionfactory.openSession();
			Query query = session.createQuery(hql);
			query.setFirstResult(1);
			query.setMaxResults(6);
			return query.list();
		}
	//搜索Fruits Cakes蛋糕
		public List<Cake> findFruitsCakes(){
			String hql = "from Cake as c where c.cakeType in(select typeId from CakeType as a where a.typeName='Fruits Cakes')" ;
			Session session = sessionfactory.openSession();
			Query query = session.createQuery(hql);
			query.setFirstResult(1);
			query.setMaxResults(6);
			return query.list();
		}
	//搜索Twist 4 tier蛋糕
		public List<Cake> findTwist4tier(){
			String hql = "from Cake as c where c.cakeType in(select typeId from CakeType as a where a.typeName='Twist 4 tier')" ;
			Session session = sessionfactory.openSession();
			Query query = session.createQuery(hql);
			query.setFirstResult(1);
			query.setMaxResults(6);
			return query.list();
		}
		//搜索框
		public List<Cake> fingSearch(@RequestParam("search")String a) {
			String hql = "from Cake";
			Session session = sessionfactory.openSession();
			Query query = session.createQuery(hql);
			List<Cake> list = query.list();
			List<Cake> cakeList = new ArrayList<Cake>();
			for(Cake cake : list) {
				if(a.equals(cake.getCakeName())) {
					cakeList.add(cake);
				}
				if(a.equals(cake.getCakeType().toString())) {
					cakeList.add(cake);
				}
				if(a.equals(cake.getCakeSize().toString())) {
					cakeList.add(cake);
				}
			}
			return cakeList;
		}
		
		
		
		//插入到购物车中
		public void findCart(@RequestParam("num")int e,@RequestParam("cake")int cake,HttpServletRequest request) throws ServletException, IOException {
			//查找用户是给购物车中添加那个蛋糕
			String hql = "from Cake where cakeId=:name";
			Session session = sessionfactory.openSession();
			Transaction tran = session.beginTransaction();
			Query query = session.createQuery(hql);
			query.setParameter("name", cake);
			//找出最近登录的客户
			HttpSession session1 = request.getSession();
			User user = (User)session1.getAttribute("userLogin");
			
			List<Cake> cakeShopList = query.list();
			for(Cake c: cakeShopList) {
				Cart cart = new Cart();
				cart.setCake(c);
				cart.setNum(e);
				cart.setUser(user);
				cart.setCakeName(c.getCakeName());
				cart.setDiscount(c.getDiscount());
				cart.setDiscountprice(c.getDiscountprice());
				cart.setImg1(c.getImg1());
				session.save(cart);
				tran.commit();
			}
				
		}
		//从单品页面将产品插入到数据库中
		public void setSingleShop(@RequestParam("num")int e,@RequestParam("cakeId")int cake,HttpServletRequest request)  throws ServletException, IOException {
			String hql = "from Cake where cakeId=:name";
			Session session = sessionfactory.openSession();
			Transaction tran = session.beginTransaction();
			Query query = session.createQuery(hql);
			query.setParameter("name", cake);
			//获得最近登录的用户
			HttpSession session1 = request.getSession();
			User user = (User)session1.getAttribute("userLogin");
			
			List<Cake> cakeShopList = query.list();
			for(Cake c: cakeShopList) {
				Cart cart = new Cart();
				cart.setCake(c);
				cart.setNum(e);
				cart.setCakeName(c.getCakeName());
				cart.setDiscount(c.getDiscount());
				cart.setDiscountprice(c.getDiscountprice());
				cart.setImg1(c.getImg1());
				cart.setUser(user);
				session.save(cart);
				tran.commit();
			}
		}
		
		
		//打印Cart中的数据
		public List<Cart> displayCart(HttpServletRequest request){
			Session session = sessionfactory.openSession();
			Transaction tran = session.beginTransaction();
			//获得最近登录的用户
			HttpSession session1 = request.getSession();
			User user = (User)session1.getAttribute("userLogin");
			Query query = null ;
			if(user!=null) {
				String hql = "from Cart where userId=:name";
				query = session.createQuery(hql);
				query.setParameter("name",user.getUserId());
				return query.list();
			}else
				System.out.println("您还没有登录！！");
			return null;
			
		}
		//删除数据库cart表中所有信息
		public void deleteCart(HttpServletRequest request) {
			Session session = sessionfactory.openSession();
			Transaction tran = session.beginTransaction();
			//获得最近登录的用户
			HttpSession session1 = request.getSession();
			User user = (User)session1.getAttribute("userLogin");
			Query query = null ;
			if(user!=null) {
				String hql = "delete Cart where userId=:name";
				query = session.createQuery(hql);
				query.setParameter("name",user.getUserId());
				int ret = query.executeUpdate();
				System.out.println(ret);
				tran.commit();
			}else
				System.out.println("您还没有登录！！");
		}
		
		//在购物出中删除顾客已经选中的单个商品
		public void deleteOneShop(@RequestParam("onlyDelete")String cakeName1,HttpServletRequest request) {
			Session session = sessionfactory.openSession();
			Transaction tran = session.beginTransaction();
			//查找蛋糕
			String hql1 = "from Cake where cakeName=:cake1";
			Query query1 =session.createQuery(hql1);
			query1.setParameter("cake1",cakeName1);
			query1.setFirstResult(0);
			query1.setMaxResults(1);
			Cake cake1 =(Cake) query1.uniqueResult();
			//获得最近登录的用户
			HttpSession session1 = request.getSession();
			User user = (User)session1.getAttribute("userLogin");
			
			Query query = null ;
			if(user!=null) {
					String hql = "delete Cart as c where c.cake.cakeId=:name and userId=:user";
					query = session.createQuery(hql);
					query.setParameter("user",user.getUserId());
					query.setParameter("name",cake1.getCakeId());
					int ret = query.executeUpdate();
					System.out.println(ret);
					tran.commit();
				}else
					System.out.println("您还没有登录！！");
			}
		//分页
		public void pageDivide(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			String hql = "from Cake" ;
			Session session = sessionfactory.openSession();
			Query query = session.createQuery(hql);
			List<Cake> list =query.list();
			HttpSession session1 = request.getSession();
			session1.setAttribute("cakeListPage", list);
			int pageCount = 6;
			session1.setAttribute("pageCount", pageCount);
			int pageIndex = 0; //记录当前页码
			if(null == request.getParameter("pageIndex") ||
					Integer.parseInt(request.getParameter("pageIndex"))<0) {
				pageIndex = 1;
			} else {
				pageIndex = Integer.parseInt(request.getParameter("pageIndex"));
			}
			session1.setAttribute("pageIndex", pageIndex);
		}
				
			
		
	
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void deleteA() {
		String hql = "delete Cake where cakeId=1";
		Session session = sessionfactory.openSession();
		Transaction tran = session.beginTransaction();
		Query query = session.createQuery(hql);
		int ret = query.executeUpdate();
		System.out.println(ret);
		tran.commit();
	}
	
	public void updateA() {
		String hql = "update Cake set cakeName='tomcat' where cakeId=1" ;
		Session session = sessionfactory.openSession();
		Transaction tran = session.beginTransaction();
		Query query = session.createQuery(hql);
		int ret = query.executeUpdate();
		tran.commit();
	}
	public void insertA(String a ,String b) {
		Session session = sessionfactory.openSession();
		Transaction tx = session.beginTransaction();
		Cake cake = new Cake() ;
		cake.setCakeName(a);
		cake.setDescription(b);
		session.save(cake);
		tx.commit();

	}
}
