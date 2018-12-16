package com.project.www;
import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.project.www.dao.IStudentDAOImpl;
import com.project.www.domain.Student;


public class AServlet extends HttpServlet{
		public void service(HttpServletRequest request,HttpServletResponse response){
			try {
				request.setCharacterEncoding("UTF-8");
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("service·þÎñ");
//			System.out.println(request.getParameter("id"));
			Student stu = new Student(Long.valueOf(request.getParameter("id")),request.getParameter("name"),Integer.valueOf(request.getParameter("age")));
//			Student student = new Student(126,"ÀîºèÕÂ",80);
			IStudentDAOImpl imp = new IStudentDAOImpl();
			imp.save(stu);
		}
}
