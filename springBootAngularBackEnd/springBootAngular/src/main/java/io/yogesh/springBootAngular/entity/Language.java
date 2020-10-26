package io.yogesh.springBootAngular.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
//@Table(name = "languages")
public class Language {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
//	@Column(name = "id")
	private Integer id;
	
//	@Column(name = "languageCode")
	private String code;
	
	public Language() {
		
	}

	public Language(Integer id, String code) {
		super();
		this.id = id;
		this.code = code;
	}
	
	public Language(String code) {
		
		this.code = code;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

}