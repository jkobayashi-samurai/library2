package com.example.demo.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.entity.LoginEntity;
import com.example.demo.domain.repository.LoginRepository;

@Service
public class LoginService {
 
	@Autowired
	LoginRepository loginRepository;
	
	public List<LoginEntity> getLogin(String id, String pass) {
		//findByIdAndPass
		List<LoginEntity> loginList = loginRepository.findByIdAndPass(id,pass);
		return loginList;
		
	}
	
}
