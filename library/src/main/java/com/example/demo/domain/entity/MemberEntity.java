package com.example.demo.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "member")
public class MemberEntity {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private String id;
	
	@Column(name = "name")
	private String name;

	@Column(name = "email")
	private String email;
	
	@Column(name = "prefecture_id")
	private String prefecture_id;
	
	@Column(name = "city_id")
	private String city_id;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "tel")
	private String tel;
	
	@Column(name = "birth_ymd")
	private String birth_ymd;
	
	@Column(name = "delete_ymd")
	private String delete_ymd;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPrefecture_id() {
		return prefecture_id;
	}

	public void setPrefecture_id(String prefecture_id) {
		this.prefecture_id = prefecture_id;
	}

	public String getCity_id() {
		return city_id;
	}

	public void setCity_id(String city_id) {
		this.city_id = city_id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getBirth_ymd() {
		return birth_ymd;
	}

	public void setBirth_ymd(String birth_ymd) {
		this.birth_ymd = birth_ymd;
	}

	public String getDelete_ymd() {
		return delete_ymd;
	}

	public void setDelete_ymd(String delete_ymd) {
		this.delete_ymd = delete_ymd;
	}


	
	
}
