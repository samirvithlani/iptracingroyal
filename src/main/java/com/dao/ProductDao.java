package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bean.ProductBean;
import com.util.DBConnection;

public class ProductDao {

	Connection conn;
	PreparedStatement pstmt;

	public boolean addProduct(ProductBean productBean) {
		boolean flag = false;

		conn = DBConnection.getDBConnection();
		if (conn != null) {

			String insertSQL = "insert into product(pname,pdetail,pimage)values(?,?,?)";
			try {
				productBean.setpStatus(true);
				pstmt = conn.prepareStatement(insertSQL);

				pstmt.setString(1, productBean.getpName());
				pstmt.setString(2, productBean.getpDetail());
				//pstmt.setDouble(3, new Double(productBean.getpPrice()));
				pstmt.setString(3, productBean.getpImageURL());
				//pstmt.setBoolean(5, productBean.ispStatus());
				//System.out.println("type/...." + productBean.getpType());
				//pstmt.setString(6, productBean.getpType());
				int res = pstmt.executeUpdate();
				if (res > 0) {

					flag = true;
				} else {
					flag = false;
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		return flag;
	}

	public List<ProductBean> getAllPhones() {

		List<ProductBean> phoneList = new ArrayList();
		conn = DBConnection.getDBConnection();
		if (conn != null) {

			String selectSQL = "select * from product";
			try {
				pstmt = conn.prepareStatement(selectSQL);
				ResultSet rs = pstmt.executeQuery();
				while (rs.next()) {

					ProductBean productBean = new ProductBean();
					productBean.setpId(rs.getInt(1));
					productBean.setpName(rs.getString(2));
					productBean.setpDetail(rs.getString(3));
					productBean.setpPrice(rs.getString(4));
					productBean.setpImageURL(rs.getString(5));
					productBean.setpStatus(rs.getBoolean(6));
					productBean.setpType(rs.getString(6));
					phoneList.add(productBean);

				}

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		return phoneList;

	}
}
