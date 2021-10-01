package com.example.demo.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.entity.CityEntity;
import com.example.demo.domain.entity.LoginEntity;
import com.example.demo.domain.entity.PrefectureEntity;
import com.example.demo.domain.repository.CityRepository;
import com.example.demo.domain.repository.LoginRepository;
import com.example.demo.domain.repository.PrefectureRepository;

@Service
public class SignupService {
 
	@Autowired
	CityRepository cityRepository;
	
	@Autowired
	PrefectureRepository prefectureRepository;
	
	public List<CityEntity> searchCity(String param) {
		List<CityEntity> cityList = cityRepository.findByPrefectureId(param);
		return cityList;
	}
	
	public List<PrefectureEntity> searchPrefecture() {
		List<PrefectureEntity> prefectureList = prefectureRepository.findAll();
		return prefectureList;
	}
	
}
