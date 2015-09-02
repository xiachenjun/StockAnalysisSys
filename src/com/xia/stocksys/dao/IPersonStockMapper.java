package com.xia.stocksys.dao;


import com.xia.stocksys.bean.PersonStock;

public interface IPersonStockMapper {

	void add(PersonStock ps);
	
	void updateIndustry(PersonStock ps);
}
