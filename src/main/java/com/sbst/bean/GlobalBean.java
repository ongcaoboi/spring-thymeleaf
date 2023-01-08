package com.sbst.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;

import com.sbst.common.Constants;
import com.sbst.functionalinterface.IRole;
import com.sbst.functionalinterface.IUserLogin;
import com.sbst.repository.RoleRepository;
import com.sbst.repository.UserRepository;

@Configuration
public class GlobalBean {
	
	@Autowired
	private RoleRepository roleR;
	
	@Autowired
	private UserRepository userR;
	
	@Bean(name = "loginPath")
	public String getLoginPath() {
		return Constants.LOGIN_PATH;
	}

	@Bean(name = "roles")
	public IRole getRoles() {
		return () -> roleR.findAll();
	}
	
	@Bean(name = "userLogin")
	public IUserLogin userLogin() {
		return () -> {
			Authentication auth = SecurityContextHolder.getContext().getAuthentication();

			if (!(auth instanceof AnonymousAuthenticationToken)) {
				UserDetails userDetails = (UserDetails) auth.getPrincipal();
				return userR.getByUsername(userDetails.getUsername());
			} else {
				return null;
			}
		};
	}
}
