package com.tenco.todo.utils;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBHelper {

	private static final String DB_HOST = "localhost";
	private static final String DB_PORT = "3306";
	private static final String DB_DATABASE_NAME = "todo";
	private static final String DB_CHARSET = "UTF-8";
	private static final String DB_USER_NAME = "root";
	private static final String DB_PASSWORD = "1234";

	private Connection conn;

	public Connection getConnection() {
		if (conn == null) {
			String urlFromat = "jdbc:mysql://%s:%s/%s?ServerTimeZone=Asia/Seoul&characterEncoding=%s";
			String url = String.format(urlFromat, DB_HOST, DB_PORT, DB_DATABASE_NAME, DB_CHARSET);
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				conn = DriverManager.getConnection(url, DB_USER_NAME, DB_PASSWORD);
				System.out.println(">>>DB 연결 완료<<<");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return conn;
	}

	public void closeConnection() {
		if (conn != null) {
			try {
				conn.close();
				conn = null;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
