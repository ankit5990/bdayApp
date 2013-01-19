package com.sample.vo;

import java.sql.Timestamp;

public class SampleVo {
	private int id;
	private String name;
	private Timestamp bday;
	private int email;
	private int emails;
	
	@Override
	public String toString() {
		return "SampleVo [id=" + id + ", name=" + name + ", bday=" + bday
				+ ", email=" + email + ", emails=" + emails + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bday == null) ? 0 : bday.hashCode());
		result = prime * result + email;
		result = prime * result + emails;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SampleVo other = (SampleVo) obj;
		if (bday == null) {
			if (other.bday != null)
				return false;
		} else if (!bday.equals(other.bday))
			return false;
		if (email != other.email)
			return false;
		if (emails != other.emails)
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
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
	public Timestamp getBday() {
		return bday;
	}
	public void setBday(Timestamp bday) {
		this.bday = bday;
	}
	public int getEmail() {
		return email;
	}
	public void setEmail(int email) {
		this.email = email;
	}
	public int getEmails() {
		return emails;
	}
	public void setEmails(int emails) {
		this.emails = emails;
	}
}
