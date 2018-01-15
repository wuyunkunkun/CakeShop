package com.catCake.cakeonline.admin.cake.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestParam;

import com.catCake.cakeonline.admin.cake.dao.cakeAdminDao;
import com.catCake.cakeonline.admin.entity.Cake;

@Service
@Transactional(readOnly = true)
public class cakeAdminService {
	@Resource
	private cakeAdminDao cakeAdminDao ;
	
	public List<Cake> findAll(){
		List<Cake> list=this.cakeAdminDao.findAll();
		return list ;
	}
	//É¾³ýµ°¸â
	public void deleteCake(@RequestParam("deleteHid")int id) {
		this.cakeAdminDao.deleteCake(id);
	}
	//¸üÐÂµ°¸âÃû×Ö
	public void updateCake(@RequestParam("saveHid")int id,@RequestParam("cake1")String aa) {
		this.cakeAdminDao.updateCake(id,aa);
	}
	//¸üÐÂµ°¸âÍ¼Æ¬
	public void updateCake1(@RequestParam("saveHid")int id,@RequestParam("cake2")String aa) {
		this.cakeAdminDao.updateCake1(id,aa);
	}
	//¸üÐÂµ°¸âÍ¼Æ¬
	public void updateCake2(@RequestParam("saveHid")int id,@RequestParam("cake3")int aa) {
		this.cakeAdminDao.updateCake2(id,aa);
	}
}
