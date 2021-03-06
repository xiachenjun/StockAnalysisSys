package com.xia.stocksys.bean;

import java.io.Serializable;

/**
 * 个股实体类
 * 
 * @author xiachenjun
 *
 */
public class PersonStock implements Serializable {

	private String id;

	private String name;

	private String industry;

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

	public String getIndustry() {
		return industry;
	}

	public void setIndustry(String industry) {
		this.industry = industry;
	}

}
