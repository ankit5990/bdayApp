package com.mcafee.bapp.vo;

import java.sql.Timestamp;
import java.util.Date;

public class BirthdayRecordVo {
	private int id;
	private int userId;
	private String name;
	private Date bday;
	private String email;
	private int[] emailGroups;
	private Timestamp timestamp;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
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
	public int[] getEmailGroups() {
		return emailGroups;
	}
	public void setEmailGroups(int[] emailGroups) {
		this.emailGroups = emailGroups;
	}
	public Timestamp getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}
	
}
