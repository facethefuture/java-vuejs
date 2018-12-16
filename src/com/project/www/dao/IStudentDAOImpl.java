package com.project.www.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.project.www.domain.Student;

public class IStudentDAOImpl implements IStudentDAO{

	public void save(Student stu) {
		Connection conn = null;
		PreparedStatement pst = null;
		StringBuilder sb = new StringBuilder(80);
		sb.append("INSERT INTO student (id,name,age) VALUES (");
		sb.append(stu.getId()+",'" +stu.getName()+"'," +stu.getAge()+")");
		String sql = sb.toString();
		// TODO Auto-generated method stub
		System.out.println(sql);
		conn = JdbcUtil.getCon();
		try {
			pst = conn.prepareStatement(sql);
			pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try{
				if (pst != null) {
					pst.close();
				}
			}catch(Exception e){
					e.printStackTrace();
				}finally{
					try{
						if (conn != null) {
							conn.close();
						}
					}catch(Exception e){
							e.printStackTrace();
					}
				}
			}
		}

	public void delete(Student stu) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Student stu) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Student> list() {
		// TODO Auto-generated method stub
		List<Student> list = new ArrayList<>();
		String sql = "SELECT * FROM Student";
		Connection conn = null;
		PreparedStatement pst = null;
		conn = JdbcUtil.getCon();
		try {
			pst = conn.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			while(rs.next()){
				Student stu = new Student(rs.getLong(1),rs.getString(2),rs.getInt(3));
				list.add(stu);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	
}
