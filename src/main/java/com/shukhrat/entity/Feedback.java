package com.shukhrat.entity;

public class Feedback {

	
	private String Name;
	private String LastName;
	private String email;
	private String country;
	private String Message;
	

	
	@Override
	public String toString() {
		return "name=" + Name + ", lastName=" + LastName + ", email=" + email + ", country=" + country + ", message="
				+ Message + "]";
	}

	public String getMessage() {
		return Message;
	}

	public void setMessage(String Message) {
		this.Message = Message;
	}

	public String getName() {
		return Name;
	}
	public void setName(String Name) {
		this.Name = Name;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String LastName) {
		this.LastName = LastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	
	
}
