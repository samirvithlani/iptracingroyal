package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	private static String userName = "mjbxpmpwmpnsss";
	private static String password = "48a3dc0548f58e30e42416648ede0d6ed8e2f6cdeb5ea7e571d2bcb7daa9065b";
	private static String connectionURL = "jdbc:postgresql://ec2-18-204-101-137.compute-1.amazonaws.com:5432/d1cdtoglqg4u7c?sslmode=require";
	private static String driverClass = "org.postgresql.Driver";

	public static Connection getDBConnection() {

		Connection conn = null;

		try {
			Class.forName(driverClass);

			conn = DriverManager.getConnection(connectionURL, userName, password);

			if (conn != null) {

				System.out.println("connected to db..");
			} else {

				System.out.println("connected to db..");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return conn;

	}

	public static void main(String[] args) {

		DBConnection.getDBConnection();
	}

}
