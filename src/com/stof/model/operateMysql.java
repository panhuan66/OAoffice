package com.stof.model;

import java.sql.*;

public class operateMysql {
	ConnectMysql connectMysql = new ConnectMysql();
	Statement statement = connectMysql.connect();

	public boolean operateToMysql(String sql) {
		int result = 0;
		boolean res = false;
		try {
			result = statement.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if (result > 0) {
			res = true;
		}
		return res;
	}
	public ResultSet selectMysql(String sql) {
		ResultSet resultSet = null;
		try {
			resultSet = statement.executeQuery(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return resultSet;
	}

}
