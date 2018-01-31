package com.situ.ssm.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.situ.ssm.entity.Student;
import com.situ.ssm.vo.StudentSearchCondition;

public interface StudentDao {
	List<Student> findAll();
	Student findById(Integer id);
	Integer deleteById(Integer id);
	
	List<Student> findByName(@Param("tableName")String tableName, @Param("name")String name);

	List<Student> getPageList(StudentSearchCondition condition);
}
