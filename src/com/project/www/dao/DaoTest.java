package com.project.www.dao;

import org.junit.Test;

import com.project.www.domain.Student;

public class DaoTest {
	@Test
	public void test(){
		Student student = new Student(125L,"ÀîºèÕÂ",80);
		IStudentDAOImpl imp = new IStudentDAOImpl();
		imp.save(student);
	}
}
