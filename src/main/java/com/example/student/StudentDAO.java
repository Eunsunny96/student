package com.example.student;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDAO {
	@Inject 
	SqlSession sqlSession;
	
	public List<StudentDTO> list(){
		
		return sqlSession.selectList("student.list");
		
	}
}
