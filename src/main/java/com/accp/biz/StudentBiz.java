package com.accp.biz;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.dao.TRecordMapper;
import com.accp.dao.TStudentMapper;
import com.accp.pojo.TRecord;
import com.accp.pojo.TStudent;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class StudentBiz {

	@Autowired
	private TStudentMapper biz1;
	 
	@Autowired
	private  TRecordMapper biz2;
	
	
	
	public TStudent selectByCodeAndTel(String code,Integer tel) {
		return biz1.selectByCodeAndTel(code, tel);
	}
	
	public PageInfo<TStudent> findSaleByPage(Integer pageNum,Integer pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		return new PageInfo<TStudent>(biz1.selectAll());
	}
    
    public int deleteByPrimaryKey(Integer id) {
    	return biz2.deleteByPrimaryKey(id);
    }

    public int insert(TRecord record) {
    	return biz2.insert(record);
    }

    public TRecord selectByPrimaryKey(Integer id) {
    	return biz2.selectByPrimaryKey(id);
    }

    public PageInfo<TRecord> selectAll(Integer pageNum,Integer pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		return new PageInfo<TRecord>(biz2.selectAll());
	}
    

    public int updateByPrimaryKey(TRecord record) {
    	return biz2.updateByPrimaryKey(record);
    }
    
    public PageInfo<TRecord> selectByCS(String code,String stucode,Integer pageNum,Integer pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		return new PageInfo<TRecord>(biz2.selectByCS(code, stucode));
	}
    
    public List<TRecord> selectByStuCode(String stuCode){
    	return biz2.selectByStuCode(stuCode);
    }
}
