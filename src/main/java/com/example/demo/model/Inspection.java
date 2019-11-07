package com.example.demo.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(value = "inspections")
public class Inspection {

	@Id
	private String id;

	@Field(name = "certificate_number")
	private String cenrtificateNumber;

	@Field(name = "business_name")
	private String businessName;

	private Date date;

	private String result;

	private String sector;

	private Address address;

	public Inspection() {
	}

	public Inspection(String id, String cenrtificateNumber, String businessName, Date date, String result, String sector,
			Address address) {
		this.id = id;
		this.cenrtificateNumber = cenrtificateNumber;
		this.businessName = businessName;
		this.date = date;
		this.result = result;
		this.sector = sector;
		this.address = address;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCenrtificateNumber() {
		return cenrtificateNumber;
	}

	public void setCenrtificateNumber(String cenrtificateNumber) {
		this.cenrtificateNumber = cenrtificateNumber;
	}

	public String getBusinessName() {
		return businessName;
	}

	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
