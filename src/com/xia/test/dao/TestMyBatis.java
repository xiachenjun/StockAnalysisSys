package com.xia.test.dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xia.test.dao.impl.TestDao;

public class TestMyBatis {

	public static void main(String[] args) {

		ApplicationContext ctx = null;
		ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		TestDao testDao = (TestDao) ctx.getBean("testDao");
		System.out.println(testDao);
		

	}
}
