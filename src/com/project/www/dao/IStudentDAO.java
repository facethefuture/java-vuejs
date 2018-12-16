package com.project.www.dao;

import java.util.List;

import com.project.www.domain.Student;

public interface IStudentDAO {
	//����ѧ��
	public void save(Student stu);
	//ɾ��ѧ��
	public void delete(Student stu);
	//�༭ѧ����Ϣ
	public void update(Student stu);
	//��ѯѧ����Ϣ
	public List<Student> list();
	
}
