package com.project.www.dao;

import java.util.List;

import com.project.www.domain.Student;

public interface IStudentDAO {
	//保存学生
	public void save(Student stu);
	//删除学生
	public void delete(Student stu);
	//编辑学生信息
	public void update(Student stu);
	//查询学生信息
	public List<Student> list();
	
}
