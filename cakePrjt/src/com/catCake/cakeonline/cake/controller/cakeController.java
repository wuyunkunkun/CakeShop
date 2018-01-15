package com.catCake.cakeonline.cake.controller;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.catCake.cakeonline.cake.service.cakeService;
import com.catCake.cakeonline.entity.Cake;
import com.catCake.cakeonline.entity.Cart;

@Controller
@RequestMapping("cake")
public class cakeController {
	@Resource
	private cakeService cakeservice ;
	
	//全部蛋糕
	@RequestMapping("/list")
	public String list(Model model) {
		List<Cake> list=this.cakeservice.listAll();
		model.addAttribute("list", list);
		return "product";
	}

	//查询Cassata
	@RequestMapping("/Cassata")
	public String findCassata(Model model) {
		List<Cake> list=this.cakeservice.findCassata();
		model.addAttribute("list", list);
		return "product";
	}
	//查询Cheesecake
		@RequestMapping("/Cheesecake")
		public String findCheesecake(Model model) {
			List<Cake> list=this.cakeservice.findCheesecake();
			model.addAttribute("list", list);
			return "product";
		}
	//查询Coconutcake
		@RequestMapping("/Coconutcake")
		public String findCoconutcake(Model model) {
			List<Cake> list=this.cakeservice.findCoconutcake();
			model.addAttribute("list", list);
			return "product";
		}
	//查询Cupcake
		@RequestMapping("/Cupcake")
		public String findCupcake(Model model) {
			List<Cake> list=this.cakeservice.findCupcake();
			model.addAttribute("list", list);
			return "product";
		}
	//查询DeliciousCakes
		@RequestMapping("/DeliciousCakes")
		public String findDeliciousCakes(Model model) {
			List<Cake> list=this.cakeservice.findDeliciousCakes();
			model.addAttribute("list", list);
			return "product";
		}
	//查询Gingerbread
		@RequestMapping("/Gingerbread")
		public String findGingerbread(Model model) {
			List<Cake> list=this.cakeservice.findGingerbread();
			model.addAttribute("list", list);
			return "product";
		}
	//查询MileCakes
		@RequestMapping("/MileCakes")
		public String findMileCakes(Model model) {
			List<Cake> list=this.cakeservice.findMileCakes();
			model.addAttribute("list", list);
			return "product";
		}
	//查询Fruits Cakes
		@RequestMapping("/FruitsCakes")
		public String findFruitsCakes(Model model) {
			List<Cake> list=this.cakeservice.findFruitsCakes();
			model.addAttribute("list", list);
			return "product";
		}
	//查询Twist4tier
		@RequestMapping("/Twist4tier")
		public String findTwist4tier(Model model) {
			List<Cake> list=this.cakeservice.findTwist4tier();
			model.addAttribute("list", list);
			return "product";
		}
		
		//search
		@RequestMapping("/search")
		public String fingSearch(@RequestParam("search")String a , Model model) {
			List<Cake> list=this.cakeservice.fingSearch(a);
			model.addAttribute("list", list);
			model.addAttribute("search",a);
			return "product";
		}
		//购物车
		@RequestMapping("/cart")
		public String findCart(@RequestParam("num")int num,@RequestParam("cake")int cake,Model model,HttpServletRequest request) {
			this.cakeservice.findCart(num, cake,request);
			return "products";
		}
		//购物车
		@RequestMapping("/singlecart")
		public String setSingleShop(@RequestParam("num")int num,@RequestParam("cakeId")int cake,Model model,HttpServletRequest request) {
			this.cakeservice.setSingleShop(num, cake,request);
			return "single";
		}
		//打印购物车中的数据
		@RequestMapping("/cartDisplay")
		public String displayCart(Model model,HttpServletRequest request){
			List<Cart> list = this.cakeservice.displayCart(request);
			model.addAttribute("cartDisplay", list);
			return "checkout";
		}
		
		//删除数据库cart表中所有信息
		@RequestMapping("/deletecart")
		public String deleteCart(HttpServletRequest request) {
			this.cakeservice.deleteCart(request);
			return "checkout";
		}
		@RequestMapping("/deletecart1")
		public String deleteCart1(HttpServletRequest request) {
			this.cakeservice.deleteCart(request);
			return "account";
		}
		@RequestMapping("/deletecart2")
		public String deleteCart2(HttpServletRequest request) {
			this.cakeservice.deleteCart(request);
			return "contact";
		}
		@RequestMapping("/deletecart3")
		public String deleteCart3(HttpServletRequest request) {
			this.cakeservice.deleteCart(request);
			return "index";
		}
		@RequestMapping("/deletecart4")
		public String deleteCart4(HttpServletRequest request) {
			this.cakeservice.deleteCart(request);
			return "product";
		}
		@RequestMapping("/deletecart5")
		public String deleteCart5(HttpServletRequest request) {
			this.cakeservice.deleteCart(request);
			return "products";
		}
		@RequestMapping("/deletecart6")
		public String deleteCart6(HttpServletRequest request) {
			this.cakeservice.deleteCart(request);
			return "single";
		}
		//在购物出中删除顾客已经选中的单个商品
		@RequestMapping("/deleteOnlycart")
		public String deleteOneShop(@RequestParam("onlyDelete")String cakeId,HttpServletRequest request,Model model) {
			this.cakeservice.deleteOneShop(cakeId, request);
			List<Cart> list = this.cakeservice.displayCart(request);
			model.addAttribute("cartDisplay", list);
			return "checkout";	
		}
		//分页
		@RequestMapping("/PageDivide")
		public String pageDivide(HttpServletRequest request, HttpServletResponse response,Model model) throws ServletException, IOException {
			this.cakeservice.pageDivide(request, response);
			return "Product";
		}



		
	
	
	
	
	
	@RequestMapping("/delete")
	public String deleteA() {
		this.cakeservice.deleteA();
		return "list";
	}
	@RequestMapping("/update")
	public String updateA() {
		this.cakeservice.updateA();
		return "list";
	}
	@RequestMapping("/insert")
	public String insertA(@RequestParam("price") String a,@RequestParam("price1")String b) {
		this.cakeservice.insertA(a,b);
		return "list";
	}
}
