package com.accp.dao;

import com.accp.pojo.TStudent;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface TStudentMapper { 

    TStudent selectByCodeAndTel(@Param("code")String code,@Param("tel")Integer tel);

    List<TStudent> selectAll();

}