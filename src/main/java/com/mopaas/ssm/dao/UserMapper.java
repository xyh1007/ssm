package com.mopaas.ssm.dao;

import org.apache.ibatis.annotations.Param;

public interface UserMapper {
	
	String getPasswordByUsername(@Param("username")String username);
	
}
