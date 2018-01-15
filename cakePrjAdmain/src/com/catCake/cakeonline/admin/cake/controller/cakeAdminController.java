package com.catCake.cakeonline.admin.cake.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.catCake.cakeonline.admin.cake.service.cakeAdminService;
import com.catCake.cakeonline.admin.entity.Cake;

@Controller
@RequestMapping("cakeadmin")
public class cakeAdminController {
	@Resource
	private cakeAdminService cakeAdminService ;
	
	@RequestMapping("/list")
	public String list(Model model) {
		List<Cake> list=this.cakeAdminService.findAll();
		model.addAttribute("cakeAdminList", list);
		return "table";
	}
	
	@RequestMapping("/delete")
	public String deleteCake(@RequestParam("deleteHid")int id,Model model) {
		this.cakeAdminService.deleteCake(id);
		List<Cake> list=this.cakeAdminService.findAll();
		model.addAttribute("cakeAdminList", list);
		return "table";
	
	}
	@RequestMapping("/update")
	public String updateCake(@RequestParam("saveHid")int id,@RequestParam("cake1")String aa,Model model) {
		this.cakeAdminService.updateCake(id,aa);
		List<Cake> list=this.cakeAdminService.findAll();
		model.addAttribute("cakeAdminList", list);
		return "table";
	}
	@RequestMapping("/update1")
	public String updateCake1(@RequestParam("saveHid")int id,@RequestParam("cake2")String aa,Model model) {
		this.cakeAdminService.updateCake1(id,aa);
		List<Cake> list=this.cakeAdminService.findAll();
		model.addAttribute("cakeAdminList", list);
		return "table";
	
	}
	@RequestMapping("/update2")
	public String updateCake2(@RequestParam("saveHid")int id,@RequestParam("cake3")int aa,Model model) {
		this.cakeAdminService.updateCake2(id,aa);
		List<Cake> list=this.cakeAdminService.findAll();
		model.addAttribute("cakeAdminList", list);
		return "table";
	
	}
}
