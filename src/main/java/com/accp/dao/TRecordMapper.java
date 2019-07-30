package com.accp.dao;

import com.accp.pojo.TRecord;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface TRecordMapper {
	
    int deleteByPrimaryKey(Integer id);

    int insert(TRecord record);

    TRecord selectByPrimaryKey(Integer id);

    List<TRecord> selectAll();

    int updateByPrimaryKey(TRecord record);
    
    List<TRecord> selectByCS(@Param("code")String code,@Param("stucode")String stucode);
    
    List<TRecord> selectByStuCode(String stuCode);
}