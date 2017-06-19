package com.mopaas.ssm.serviceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mopaas.ssm.dao.UserMapper;
import com.mopaas.ssm.service.UserSer;
@Service
public class UserSerImp implements UserSer {
   @Autowired
   private UserMapper userMapper;
	@Override
	public void getPasswordByUsername(String username) {
		// TODO Auto-generated method stub
		userMapper.getPasswordByUsername(username);
	}
}
