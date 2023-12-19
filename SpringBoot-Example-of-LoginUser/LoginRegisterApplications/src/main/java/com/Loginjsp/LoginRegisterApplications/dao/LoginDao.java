package com.Loginjsp.LoginRegisterApplications.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Loginjsp.LoginRegisterApplications.Repository.LoginRepository;
import com.Loginjsp.LoginRegisterApplications.dto.LoginDto;

@Repository
public class LoginDao 
{
	@Autowired
	LoginRepository repository;
	
	public LoginDto saveUser(LoginDto dto)
	{
		return repository.save(dto);
	}
	public boolean validateUser(LoginDto dto)
	{
		LoginDto dt = repository.validateUser(dto.getUsername(), dto.getPassword());
		if(dt != null)
		{
			return true;
		}
		return false; 
	}

}
