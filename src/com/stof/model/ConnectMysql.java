package com.stof.model;

import java.sql.*;

public class ConnectMysql {
	Statement stm = null;
	Connection con = null;

	public Statement connect() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			con = DriverManager
					.getConnection(
							"jdbc:mysql://127.0.0.1:3306/oaoffice?useUnicode=true&characterEncoding=utf8",
							"root", "123456789");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			stm = con.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return stm;
	}
}
