package com.xia.test.dao.impl;

import org.apache.ibatis.session.SqlSessionFactory;

import com.xia.test.bean.Test;
import com.xia.test.dao.ITestDao;
import com.xia.test.mapper.TestMapper;

public class TestDao implements ITestDao {

	SqlSessionFactory sqlSessionFactory;

	public void test() {
		TestMapper mapper = sqlSessionFactory.openSession().getMapper(TestMapper.class);
		Test test = mapper.selectBlog(1);
		System.out.println(test.getName());
	}
}
