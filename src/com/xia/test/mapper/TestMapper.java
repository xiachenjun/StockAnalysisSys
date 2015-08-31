package com.xia.test.mapper;

import org.apache.ibatis.annotations.Select;

import com.xia.test.bean.Test;

public interface TestMapper {

	@Select("SELECT * FROM test WHERE id = #{id}")
	Test selectBlog(int id);
}
