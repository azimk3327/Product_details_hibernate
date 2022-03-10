package com.product.details;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
	
	@Id
	private int proID;
	private String proName;
	private String proDescription;
	private String proManufectureDate;
	private String proExpiryDate;
	
	public int getProID() {
		return proID;
	}
	public void setProID(int proID) {
		this.proID = proID;
	}
	public String getProName() {
		return proName;
	}
	public void setProName(String proName) {
		this.proName = proName;
	}
	public String getProDescription() {
		return proDescription;
	}
	public void setProDescription(String proDescription) {
		this.proDescription = proDescription;
	}
	public String getProManufectureDate() {
		return proManufectureDate;
	}
	public void setProManufectureDate(String string) {
		this.proManufectureDate = string;
	}
	public String getProExpiryDate() {
		return proExpiryDate;
	}
	public void setProExpiryDate(String proExpiryDate) {
		this.proExpiryDate = proExpiryDate;
	}
	public Product(int proID, String proName, String proDescription, String proManufectureDate, String proExpiryDate) {
		super();
		this.proID = proID;
		this.proName = proName;
		this.proDescription = proDescription;
		this.proManufectureDate = proManufectureDate;
		this.proExpiryDate = proExpiryDate;
	}
	public Product() {
		super();
	}
	@Override
	public String toString() {
		return "Product [proID=" + proID + ", proName=" + proName + ", proDescription=" + proDescription
				+ ", proManufectureDate=" + proManufectureDate + ", proExpiryDate=" + proExpiryDate + "]";
	}
	
	
	

}
