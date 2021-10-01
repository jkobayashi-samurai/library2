package com.example.demo.app.controller;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.domain.entity.CityEntity;
import com.example.demo.domain.entity.MemberEntity;
import com.example.demo.domain.entity.PrefectureEntity;
import com.example.demo.domain.repository.MemberRepository;
import com.example.demo.domain.service.SignupService;

//import com.example.demo.domain.service.LoginService;

@Controller
public class SinupController {

	@Autowired
	SignupService signupService;
	
	@Autowired
	MemberRepository memberRepository;
	
	@RequestMapping("/signup")
	public ModelAndView init(ModelAndView mv) {
		List<PrefectureEntity> pList = signupService.searchPrefecture();		
		mv.addObject("pList", pList);
		mv.setViewName("/signup");
		return mv;
	}
	
	@RequestMapping("/signup2")
	@ResponseBody
//	public ModelAndView signup2(
	public String signup2(
			@RequestParam (name = "param1")String param1,
			ModelAndView mv) {
		
		List<CityEntity> cList = signupService.searchCity(param1);

		// 都道府県を全件取得
		List<PrefectureEntity> pList = signupService.searchPrefecture();
		
		// 都道府県プルダウン選択値をセット
		List<String> selectedList = new ArrayList<>();
		for (PrefectureEntity p : pList) {
			if (p.getPrefectureId().equals(param1)) {
				selectedList.add("selected");
			} else {
				selectedList.add("");
			}
		}

		String resultStr = "";
		resultStr += "<option value=\"\"></option>";


		for(CityEntity c : cList) {
			resultStr += "<option value=\"" + c.getCityId() +  "\">" + c.getCityName() + "</option>";
		}
		mv.addObject("resultStr", resultStr);
		mv.addObject("pList", pList);
		mv.addObject("cList", cList);
		
		return resultStr;
	}
	
	@RequestMapping("/check")
	public ModelAndView check(
			@RequestParam (name = "name")String name,
			@RequestParam (name = "email")String email,
			@RequestParam (name = "prefectureId")String prefectureId,
			@RequestParam (name = "cityId")String cityId,
			@RequestParam (name = "address")String address,
			@RequestParam (name = "tel")String tel,
			@RequestParam (name = "birth_ymd")String birth_ymd,
			@RequestParam (name = "birth_ymd2")String birth_ymd2,
			@RequestParam (name = "birth_ymd3")String birth_ymd3,
			ModelAndView mv) {
		
//		MemberEntity m = new MemberEntity();
//		m.setName(name);
//		m.setEmail(email);
//		m.setPrefecture_id(prefectureId);
//		m.setCity_id(cityId);
//		m.setAddress(address);
//		m.setTel(tel);
//		m.setBirth_ymd(birth_ymd + birth_ymd2 + birth_ymd3);
//		m.setDelete_ymd("99999999");
//		
//		memberRepository.save(m);
		
		mv.addObject("name", name);
		mv.addObject("email", email);
		mv.addObject("prefectureId", prefectureId);
		mv.addObject("cityId", cityId);
		mv.addObject("address", address);
		mv.addObject("tel", tel);
		mv.addObject("birth_ymd", birth_ymd);
		mv.addObject("birth_ymd2", birth_ymd2);
		mv.addObject("birth_ymd3", birth_ymd3);
		mv.setViewName("/check");
		return mv;
	}
	
	@RequestMapping("/check2")
	public ModelAndView check2(
			@RequestParam (name = "name")String name,
			@RequestParam (name = "email")String email,
			@RequestParam (name = "prefectureId")String prefectureId,
			@RequestParam (name = "cityId")String cityId,
			@RequestParam (name = "address")String address,
			@RequestParam (name = "tel")String tel,
			@RequestParam (name = "birth_ymd")String birth_ymd,
			@RequestParam (name = "birth_ymd2")String birth_ymd2,
			@RequestParam (name = "birth_ymd3")String birth_ymd3,
			ModelAndView mv) {
		
		MemberEntity m = new MemberEntity();
		m.setName(name);
		m.setEmail(email);
		m.setPrefecture_id(prefectureId);
		m.setCity_id(cityId);
		m.setAddress(address);
		m.setTel(tel);
		m.setBirth_ymd(birth_ymd + birth_ymd2 + birth_ymd3);
		m.setDelete_ymd("99999999");
		memberRepository.save(m);
		
		//判定orSELECT
		
		//SELECT
		
		
		
		//mv.addObject("list", list);
		mv.addObject("name", name);
		mv.addObject("email", email);
		mv.addObject("prefectureId", prefectureId);
		mv.addObject("cityId", cityId);
		mv.addObject("address", address);
		mv.addObject("tel", tel);
		mv.addObject("birth_ymd", birth_ymd);
		mv.addObject("birth_ymd2", birth_ymd2);
		mv.addObject("birth_ymd3", birth_ymd3);
		mv.addObject("message", "登録しました。");
		mv.addObject("message", "失敗しました。");
		mv.setViewName("/check");
		return mv;
	}
	
	@RequestMapping("/menu")
	public ModelAndView menu(ModelAndView mv) {
		mv.setViewName("/menu");
		return mv;
	}
}
