package com.exapmle.beanLifeCycle.annotations;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OldStudentDao {

	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://localhost:3306/student";
	private String username = "root";
	private String password = "root";

	public void selectAllRow() throws ClassNotFoundException, SQLException {

		Class.forName(driver);

		Connection con = DriverManager.getConnection(url, username, password);

		Statement smt = con.createStatement();

		ResultSet rs = smt.executeQuery("select * from HostelStudentInfo;");

		while (rs.next()) {
			int s_id = rs.getInt(1);
			String s_name = rs.getString(2);
			int hostelFee = rs.getInt(3);
			String foodtype = rs.getString(4);

			System.out.println(s_id + " " + s_name + " " + hostelFee + " " + foodtype);
		}
		
		con.close();

	}

	public void deleteStundetRecord(int student_id) throws ClassNotFoundException, SQLException {

		Class.forName(driver);

		Connection con = DriverManager.getConnection(url, username, password);

		Statement smt = con.createStatement();

		smt.executeUpdate("delete from HostelStudentInfo where student_id = " + student_id);

		System.out.println("Record delete with student id " + student_id);
		
		con.close();

	}

}
