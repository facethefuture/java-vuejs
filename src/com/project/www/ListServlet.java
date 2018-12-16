package com.project.www;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;
import com.project.www.dao.IStudentDAOImpl;
import com.project.www.domain.Student;

public class ListServlet extends HttpServlet{
	public void service(HttpServletRequest request,HttpServletResponse response){
		response.setHeader("Access-Control-Allow-Origin", "*");
		System.out.println("øÁ”Ú«Î«Û");
		try {
			request.setCharacterEncoding("UTF-8");
//			request
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		response.setContentType("application/json;charset=utf-8");

		IStudentDAOImpl is = new IStudentDAOImpl();
		List<Student> list = is.list();
		String jsonStr = JSON.toJSONString(list);
		PrintWriter out = null;
		try {
			out = response.getWriter();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		out.write(jsonStr);
	}
}
