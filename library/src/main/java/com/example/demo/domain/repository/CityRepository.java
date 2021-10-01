package com.example.demo.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.entity.CityEntity;
import com.example.demo.domain.entity.LoginEntity;

@Repository
public interface CityRepository extends JpaRepository<CityEntity, String> {
	
	List<CityEntity> findByPrefectureId(String param);
}
