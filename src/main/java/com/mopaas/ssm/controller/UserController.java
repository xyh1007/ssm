package com.mopaas.ssm.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mopaas.ssm.service.UserSer;

@Controller
public class UserController {
	@Autowired
	private UserSer userSer;
	@RequestMapping(value="/ssmsys/login",method = RequestMethod.POST)
	@ResponseBody
	public ModelMap login(@RequestParam Map<String, Object> params){
		ModelMap result = new ModelMap();
		String msg = "登陆失败"; 
		String username = (String) params.get("username");
		String password = (String) params.get("password");
		userSer.getPasswordByUsername(username);
		/*String truepassword=userSer.getPasswordByUsername(username);
		if(password.equals(truepassword)){
			msg="登陆成功";
		}else{
			
		}*/
		result.addAttribute("msg", msg);
		return result;
	}
}
