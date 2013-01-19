package com.sample.vo;

import java.util.Date;

public class SampleVo {
	private int id;
	private String name;
	private Date bday;
	private String email;
	private int[] emails;
	
	public SampleVo(String name, Date bday, String email, int[] emails) {
		super();
		this.name = name;
		this.bday = bday;
		this.email = email;
		this.emails = emails;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBday() {
		return bday;
	}
	public void setBday(Date bday) {
		this.bday = bday;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int[] getEmails() {
		return emails;
	}
	public void setEmails(int[] emails) {
		this.emails = emails;
	}
}
