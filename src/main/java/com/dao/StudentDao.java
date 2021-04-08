package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bean.StudentBean;
import com.util.DBConnection;

public class StudentDao {

	public boolean addStudent(StudentBean studentBean) {

		boolean flag = false;
		Connection conn = DBConnection.getDBConnection();

		if (conn != null) {

			try {
				PreparedStatement pstmt = conn.prepareStatement("insert into student(sname)values(?)");
				pstmt.setString(1, studentBean.getsName());
				int res = pstmt.executeUpdate();
				if (res > 0) {

					flag = true;
				}

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		return flag;

	}

	public List<StudentBean> getAllStudents() {

		Connection conn = DBConnection.getDBConnection();
		List<StudentBean> students = new ArrayList<>();
		if (conn != null) {

			try {
				PreparedStatement pstmt = conn.prepareStatement("select * from student");
				ResultSet rs = pstmt.executeQuery();
				while (rs.next()) {

					StudentBean studentBean = new StudentBean();
					studentBean.setsId(rs.getInt(1));
					studentBean.setsName(rs.getString(2));
					students.add(studentBean);
				}

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		return students;
	}
}
