package com.Loginjsp.LoginRegisterApplications.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.Loginjsp.LoginRegisterApplications.dto.LoginDto;

public interface LoginRepository extends JpaRepository<LoginDto, Integer>
{
	@Query("select lo from LoginDto lo where lo.username=?1 and lo.password=?2")
	public LoginDto validateUser(String username, String password);

}
