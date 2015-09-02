package com.xia.stocksys.service.impl;

import com.xia.stocksys.bean.PersonStock;
import com.xia.stocksys.dao.IPersonStockMapper;
import com.xia.stocksys.service.IPersonStockService;

public class PersonStockService implements IPersonStockService {

	private IPersonStockMapper pss;

	@Override
	public void add(PersonStock ps) {
		pss.add(ps);
	}

	public IPersonStockMapper getPss() {
		return pss;
	}

	public void setPss(IPersonStockMapper pss) {
		this.pss = pss;
	}

	@Override
	public void updateIndustry(PersonStock ps) {
		pss.updateIndustry(ps);
	}

	
}
