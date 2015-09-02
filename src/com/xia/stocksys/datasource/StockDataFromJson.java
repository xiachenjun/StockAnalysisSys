package com.xia.stocksys.datasource;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.xia.stocksys.bean.PersonStock;
import com.xia.stocksys.service.IPersonStockService;
import com.xia.stocksys.service.impl.PersonStockService;

/**
 * �ӱ���json�ļ��л�ȡ��Ʊ��¼�������ݿ�
 * 
 * @author �ĳ���
 *
 */
public class StockDataFromJson {

	static ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
	static Gson gson = new Gson();

	public static void main(String[] args) {

		// importBaseDate("d:/data.json");

		importIndustryDate("d:/i.json", "14");

	}

	/**
	 * �����������
	 * 
	 * @param filePath
	 */
	public static void importBaseDate(String filePath) {

		Type listType = new TypeToken<ArrayList>() {
		}.getType();
		FileReader fr = null;
		try {
			fr = new FileReader(new File(filePath));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ArrayList list = gson.fromJson(fr, listType);
		IPersonStockService pss = ctx.getBean(PersonStockService.class);

		for (int i = 0; i < list.size(); i++) {
			PersonStock ps = new PersonStock();
			ps.setId(list.get(i).toString().split(",")[1]);
			ps.setName(list.get(i).toString().split(",")[2]);
			pss.add(ps);
		}
		System.out.println("�������");
	}

	public static void importIndustryDate(String filePath, String industry) {
		Type listType = new TypeToken<ArrayList>() {
		}.getType();
		FileReader fr = null;
		try {
			fr = new FileReader(new File(filePath));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ArrayList list = gson.fromJson(fr, listType);
		IPersonStockService pss = ctx.getBean(PersonStockService.class);

		for (int i = 0; i < list.size(); i++) {
			PersonStock ps = new PersonStock();
			ps.setId(list.get(i).toString().split(",")[1]);
			ps.setIndustry(industry);
			pss.updateIndustry(ps);
		}
		System.out.println("�޸Ľ���");
	}

}
