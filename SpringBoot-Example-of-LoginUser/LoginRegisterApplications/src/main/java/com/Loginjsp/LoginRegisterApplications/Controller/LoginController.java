package com.Loginjsp.LoginRegisterApplications.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Loginjsp.LoginRegisterApplications.dao.LoginDao;
import com.Loginjsp.LoginRegisterApplications.dto.LoginDto;

@RestController
public class LoginController 
{
	@Autowired
	LoginDao dao;
	
	@PostMapping("/reg")
	public LoginDto saveUser(@RequestBody LoginDto dto)
	{
		return dao.saveUser(dto);
	}
	
	@GetMapping("/login")
	public String validateUser(@RequestBody LoginDto dto)
	{
		boolean res = dao.validateUser(dto);
		if(res == true)
		{
			return "Login Sucessfull...";
		}
		return "Invalid username or Password";
	}
	

}
