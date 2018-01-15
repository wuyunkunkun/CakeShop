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
	//��ѯ���еĵ���
	public List<Cake> listAll() {
		List<Cake> list = cakeDaoImpl.findAll();
		return list;
	}
	//��ѯCassata����
	public List<Cake> findCassata() {
		List<Cake> list = cakeDaoImpl.findCassata();
		return list;
	}
	//��ѯCheesecake����
	public List<Cake> findCheesecake() {
		List<Cake> list = cakeDaoImpl.findCheesecake();
		return list;
	}
	//��ѯCoconutcake����
	public List<Cake> findCoconutcake() {
		List<Cake> list = cakeDaoImpl.findCoconutcake();
		return list;
	}
	//��ѯCupcake����
		public List<Cake> findCupcake() {
			List<Cake> list = cakeDaoImpl.findCupcake();
			return list;
		}
	//��ѯDeliciousCakes����
		public List<Cake> findDeliciousCakes() {
			List<Cake> list = cakeDaoImpl.findDeliciousCakes();
			return list;
		}
	//��ѯGingerbread����
		public List<Cake> findGingerbread() {
			List<Cake> list = cakeDaoImpl.findGingerbread();
			return list;
		}
	//��ѯMileCakes����
		public List<Cake> findMileCakes() {
			List<Cake> list = cakeDaoImpl.findMileCakes();
			return list;
		}
	//��ѯFruits Cakes����
		public List<Cake> findFruitsCakes() {
			List<Cake> list = cakeDaoImpl.findFruitsCakes();
			return list;
		}
	//��ѯTwist4tier����
		public List<Cake> findTwist4tier() {
			List<Cake> list = cakeDaoImpl.findTwist4tier();
			return list;
		}
	//search
		public List<Cake> fingSearch(@RequestParam("search")String a) {
			List<Cake> list = cakeDaoImpl.fingSearch(a);
				return list;
		}
		//���ﳵ
		public void findCart(@RequestParam("num")int num,@RequestParam("cake")int cake,HttpServletRequest request) {
			try {
				this.cakeDaoImpl.findCart(num, cake,request);
			} catch (ServletException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		//�ӵ�Ʒҳ����뵽���ﳵ��
		public void setSingleShop(@RequestParam("num")int num,@RequestParam("cakeId")int cake,HttpServletRequest request) {
			try {
				this.cakeDaoImpl.setSingleShop(num, cake,request);
			} catch (ServletException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//��ӡ���ﳵ�е�����
		public List<Cart> displayCart(HttpServletRequest request){
			List<Cart> list = cakeDaoImpl.displayCart(request);
			return list ;
		}
		//ɾ�����ݿ�cart����������Ϣ
		public void deleteCart(HttpServletRequest request) {
			this.cakeDaoImpl.deleteCart(request);
		}
		//�ڹ������ɾ���˿��Ѿ�ѡ�еĵ�����Ʒ
		public void deleteOneShop(@RequestParam("onlyDelete")String cakeId,HttpServletRequest request) {
			this.cakeDaoImpl.deleteOneShop(cakeId, request);
		}
		//��ҳ
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
