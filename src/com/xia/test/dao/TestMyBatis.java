package com.xia.test.dao;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.xia.test.bean.Test;
import com.xia.test.mapper.TestMapper;

public class TestMyBatis {

	static String resource = "mybatis-config.xml";

	public static void main(String[] args) {
		InputStream inputStream;
		try {
			inputStream = Resources.getResourceAsStream(resource);
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			SqlSession sqlSession = sqlSessionFactory.openSession();
			TestMapper mapper = sqlSession.getMapper(TestMapper.class);
			Test test = mapper.selectBlog(1);
			System.out.println(test.getName());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
