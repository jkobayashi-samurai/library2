package com.example.demo.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.entity.LoginEntity;

@Repository
public interface LoginRepository extends JpaRepository<LoginEntity, String> {
	
	List<LoginEntity> findByIdAndPass(String id, String pass);

}
