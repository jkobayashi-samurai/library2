package com.example.demo.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "city")
public class CityEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PREFECTURE_ID")
	private String prefectureId;
	
	@Column(name = "city_id")
	private String cityId;
	
	@Column(name = "city_NAME")
	private String cityName;
	
	@Column(name = "CITY_NAME_KANA")
	private String cityNameKana;

	public String getPrefectureId() {
		return prefectureId;
	}

	public void setPrefectureId(String prefectureId) {
		this.prefectureId = prefectureId;
	}

	public String getCityId() {
		return cityId;
	}

	public void setCityId(String cityId) {
		this.cityId = cityId;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getCityNameKana() {
		return cityNameKana;
	}

	public void setCityNameKana(String cityNameKana) {
		this.cityNameKana = cityNameKana;
	}

	


}
