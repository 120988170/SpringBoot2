package com.accp.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.StudentBiz;
import com.accp.pojo.TRecord;
import com.alibaba.fastjson.JSON;

@RestController
@RequestMapping("/c")
public class CAction {

	@Autowired
	private StudentBiz biz;
	
	
	@GetMapping("Records")
	public List<TRecord> goToMsg(String stuCode,Model model) { 
		return biz.selectByStuCode(stuCode);
	}
	
	
	@DeleteMapping("deleteTR")
	public Map<String,String> deleteTR(Integer id) {
		Map<String, String> message = new HashMap<String, String>();
		int count=biz.deleteByPrimaryKey(id);
		if(count!=0) {
			message.put("code","100");
			message.put("msg","删除成功！");
		}else {
			message.put("code","500");
			message.put("msg","删除失败！");
		}
		return message;
	}

	@GetMapping("selectByTR")
	public TRecord selectByTR(Integer id) {
		return biz.selectByPrimaryKey(id);
	}
	
	
	@PutMapping("updateTR")
	public Map<String,String> updateTR(String trecord) {
		Map<String, String> message = new HashMap<String, String>();
		TRecord trecord2=JSON.parseObject(trecord,TRecord.class);
		int count=biz.updateByPrimaryKey(trecord2);
		if(count!=0) {
			message.put("code","100");
			message.put("msg","修改成功！");
		}else {
			message.put("code","500");
			message.put("msg","修改失败！");
		}
		return message;
	}
}
