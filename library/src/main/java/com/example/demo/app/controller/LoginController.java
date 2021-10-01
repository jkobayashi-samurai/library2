package com.example.demo.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.example.demo.domain.entity.LoginEntity;
import com.example.demo.domain.repository.LoginRepository;
import com.example.demo.domain.service.LoginService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	
	@Autowired
	LoginService loginService;

	@RequestMapping("/")
	public ModelAndView init(ModelAndView mv) {

		mv.setViewName("/login");
		return mv;
	}
	
	@RequestMapping("/login")
	public ModelAndView login(
			@RequestParam (name = "id")String id,
			@RequestParam (name = "pass")String pass,
			ModelAndView mv) {
		
		
		if(id.equals("")||pass.equals("")) {
			mv.setViewName("/login");
			mv.addObject("message", "IDとパスワードは必須です。");
			return mv;
		}
		
		List<LoginEntity> loginList = loginService.getLogin(id, pass);
		
		if(loginList.size() == 0) {
			mv.setViewName("/login");
			mv.addObject("message", "IDまたはパスワードが違います。");
		}else{
			mv.setViewName("/menu");
		}


		
		return mv;
	}


}
