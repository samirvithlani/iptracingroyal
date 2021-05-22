package com.bean;

import java.sql.Timestamp;

public class ProductBean {

	private int pId;
	private String pName;
	private String pPrice;
	private String pDetail;
	private Timestamp creationDate;
	private Timestamp updateionDate;
	private String pImageURL;
	private boolean pStatus;
	private String pType;

	public String getpType() {
		return pType;
	}

	public void setpType(String pType) {
		this.pType = pType;
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public String getpPrice() {
		return pPrice;
	}

	public void setpPrice(String pPrice) {
		this.pPrice = pPrice;
	}

	public String getpDetail() {
		return pDetail;
	}

	public void setpDetail(String pDetail) {
		this.pDetail = pDetail;
	}

	public Timestamp getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Timestamp creationDate) {
		this.creationDate = creationDate;
	}

	public Timestamp getUpdateionDate() {
		return updateionDate;
	}

	public void setUpdateionDate(Timestamp updateionDate) {
		this.updateionDate = updateionDate;
	}

	public String getpImageURL() {
		return pImageURL;
	}

	public void setpImageURL(String pImageURL) {
		this.pImageURL = pImageURL;
	}

	public boolean ispStatus() {
		return pStatus;
	}

	public void setpStatus(boolean pStatus) {
		this.pStatus = pStatus;
	}

}
