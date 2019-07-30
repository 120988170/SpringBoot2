package com.accp.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.accp.biz.StudentBiz;
import com.accp.pojo.TRecord;
import com.accp.pojo.TStudent;


@Controller
@RequestMapping("/api")
public class ApiAction {

	@Autowired
	private StudentBiz biz;
	
	@GetMapping("login")
	public String goToLogin(Model model) {
		return "login";
	}
	
	@PostMapping("logins")
	public String goToLogin2(TStudent stua,Model model,HttpSession session) {
		TStudent stu= biz.selectByCodeAndTel(stua.getCode(),stua.getTel());
		System.out.println(stua);
		if(stu!=null) {
			System.out.println("登录成功！");
			session.setAttribute("STU",stu);
			model.addAttribute("PAGE",biz.findSaleByPage(1, 3));
			model.addAttribute("LIST",new ArrayList<TRecord>());
			model.addAttribute("AllRecord",biz.selectAll(1, 3));
		}else {
			System.out.println("登录失败！");
			model.addAttribute("MSG","账户名或密码错误");
			return "login";
		}
		return "index";
	}
	
	
	@GetMapping("index/list")
	public String goToMsg22(Integer p,Integer s,Model model) {
		model.addAttribute("PAGE",biz.findSaleByPage(1, 3));
		model.addAttribute("LIST",new ArrayList<TRecord>());
		model.addAttribute("PAGE",biz.findSaleByPage(p,s));
		return "index";
	}
	
	
	
	@GetMapping("index2/list")
	public String goToMsg222(Integer p,Integer s,Model model) {
		model.addAttribute("PAGE",biz.findSaleByPage(p,s));
		return "index";
	}
	
	@GetMapping("update")
	public String goToDemo(Integer itemid,Model model) {
		return "update";
	}
	
	@PostMapping("index")
	public String goToDemo2() {
		return "redirect:/view/login";
	}
}
