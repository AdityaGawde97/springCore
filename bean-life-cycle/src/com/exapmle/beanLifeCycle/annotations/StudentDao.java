package com.exapmle.beanLifeCycle.annotations;

import java.sql.Statement;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class StudentDao {

	private String driver;
	private String url;
	private String username;
	private String password;
	Connection con;
	
	@Value("com.mysql.cj.jdbc.Driver")
	public void setDriver(String driver) {
		this.driver = driver;
	}

	@Value("jdbc:mysql://localhost:3306/student")
	public void setUrl(String url) {
		this.url = url;
	}

	@Value("root")
	public void setUsername(String username) {
		this.username = username;
	}

	@Value("root")
	public void setPassword(String password) {
		this.password = password;
	}

	@PostConstruct
	public void getDBConnection() throws ClassNotFoundException, SQLException {
		System.out.println("initialize");
		Class.forName(driver);

		con = DriverManager.getConnection(url, username, password);
	}

	public void selectAllRow() throws SQLException {

		Statement smt = con.createStatement();

		ResultSet rs = smt.executeQuery("select * from HostelStudentInfo;");

		while (rs.next()) {
			int s_id = rs.getInt(1);
			String s_name = rs.getString(2);
			int hostelFee = rs.getInt(3);
			String foodtype = rs.getString(4);

			System.out.println(s_id + " " + s_name + " " + hostelFee + " " + foodtype);
		}

	}

	public void deleteStundetRecord(int student_id) throws SQLException {

		Statement smt = con.createStatement();

		smt.executeUpdate("delete from HostelStudentInfo where student_id = " + student_id);

		System.out.println("Record delete with student id " + student_id);
		
	}
	
	@PreDestroy
	public void closeConnection() throws SQLException {
		System.out.println("destroy");
		con.close();
	}

}
