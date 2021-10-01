package com.example.demo.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "prefecture")
public class PrefectureEntity {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PREFECTURE_ID")
	private String prefectureId;
	
	@Column(name = "PREFECTURE_NAME")
	private String prefectureName;
	
	@Column(name = "PREFECTURE_NAME_KANA")
	private String prefectureNameKana;

	
	public String getPrefectureId() {
		return prefectureId;
	}

	public void setPrefectureId(String prefectureId) {
		this.prefectureId = prefectureId;
	}

	public String getPrefectureName() {
		return prefectureName;
	}

	public void setPrefectureName(String prefectureName) {
		this.prefectureName = prefectureName;
	}

	public String getPrefectureNameKana() {
		return prefectureNameKana;
	}

	public void setPrefectureNameKana(String prefectureNameKana) {
		this.prefectureNameKana = prefectureNameKana;
	}

}
