package com.project.www.dao;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import javax.sql.DataSource;

import com.alibaba.druid.pool.DruidDataSource;

//public class jdbcUtil {
//	public static Connection getConn(){
//		DruidDataSource ds = new DruidDataSource();
//		ds.setDriverClassName("com.mysql.jdbc.Driver");
//		ds.setUrl("jdbc:mysql://localhost:3306/jdbcdemo");
//		ds.setUsername("root");
//		ds.setPassword("admin");
//		try {
//			Connection conn = ds.getConnection();
//			return conn;
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return null;
//		
//	}
//
//}
public class JdbcUtil {
	static Properties p = new Properties();
	static {
		try{
			
			InputStream inStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("db.properties");
			p.load(inStream);
			Class.forName(p.getProperty("driverClassName"));
			System.out.println(p.getProperty("driverClassName"));
		} catch(Exception e){
			e.printStackTrace();
		}
	}
	public static Connection getCon(){
		try{
			Connection conn = DriverManager.getConnection(p.getProperty("url"),p.getProperty("username"),p.getProperty("password"));
			return conn;
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}
}
