package com.catCake.cakeonline.cake.service;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestParam;

import com.catCake.cakeonline.cake.dao.cakeDaoImpl;
import com.catCake.cakeonline.entity.Cake;
import com.catCake.cakeonline.entity.Cart;

@Service
@Transactional(readOnly = true)
public class cakeService {
	@Resource
	private cakeDaoImpl cakeDaoImpl ;
	//查询所有的蛋糕
	public List<Cake> listAll() {
		List<Cake> list = cakeDaoImpl.findAll();
		return list;
	}
	//查询Cassata蛋糕
	public List<Cake> findCassata() {
		List<Cake> list = cakeDaoImpl.findCassata();
		return list;
	}
	//查询Cheesecake蛋糕
	public List<Cake> findCheesecake() {
		List<Cake> list = cakeDaoImpl.findCheesecake();
		return list;
	}
	//查询Coconutcake蛋糕
	public List<Cake> findCoconutcake() {
		List<Cake> list = cakeDaoImpl.findCoconutcake();
		return list;
	}
	//查询Cupcake蛋糕
		public List<Cake> findCupcake() {
			List<Cake> list = cakeDaoImpl.findCupcake();
			return list;
		}
	//查询DeliciousCakes蛋糕
		public List<Cake> findDeliciousCakes() {
			List<Cake> list = cakeDaoImpl.findDeliciousCakes();
			return list;
		}
	//查询Gingerbread蛋糕
		public List<Cake> findGingerbread() {
			List<Cake> list = cakeDaoImpl.findGingerbread();
			return list;
		}
	//查询MileCakes蛋糕
		public List<Cake> findMileCakes() {
			List<Cake> list = cakeDaoImpl.findMileCakes();
			return list;
		}
	//查询Fruits Cakes蛋糕
		public List<Cake> findFruitsCakes() {
			List<Cake> list = cakeDaoImpl.findFruitsCakes();
			return list;
		}
	//查询Twist4tier蛋糕
		public List<Cake> findTwist4tier() {
			List<Cake> list = cakeDaoImpl.findTwist4tier();
			return list;
		}
	//search
		public List<Cake> fingSearch(@RequestParam("search")String a) {
			List<Cake> list = cakeDaoImpl.fingSearch(a);
				return list;
		}
		//购物车
		public void findCart(@RequestParam("num")int num,@RequestParam("cake")int cake,HttpServletRequest request) {
			try {
				this.cakeDaoImpl.findCart(num, cake,request);
			} catch (ServletException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		//从单品页面插入到购物车：
		public void setSingleShop(@RequestParam("num")int num,@RequestParam("cakeId")int cake,HttpServletRequest request) {
			try {
				this.cakeDaoImpl.setSingleShop(num, cake,request);
			} catch (ServletException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//打印购物车中的数据
		public List<Cart> displayCart(HttpServletRequest request){
			List<Cart> list = cakeDaoImpl.displayCart(request);
			return list ;
		}
		//删除数据库cart表中所有信息
		public void deleteCart(HttpServletRequest request) {
			this.cakeDaoImpl.deleteCart(request);
		}
		//在购物出中删除顾客已经选中的单个商品
		public void deleteOneShop(@RequestParam("onlyDelete")String cakeId,HttpServletRequest request) {
			this.cakeDaoImpl.deleteOneShop(cakeId, request);
		}
		//分页
		public void pageDivide(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			this.cakeDaoImpl.pageDivide(request, response);
		}

		
		
		
		
		
		
	public void deleteA() {
		this.cakeDaoImpl.deleteA();
	}
	
	public void updateA() {
		this.cakeDaoImpl.updateA();
	}
	public void insertA(String a , String b) {
		this.cakeDaoImpl.insertA(a,b);
	}

}
