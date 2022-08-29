package com.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="REGISTRATIONS")
@Entity
public class Registration {
String adminName;
@Id
@Column(name="EMAIL")
String email;
String phone;
String password;

public Registration() {
	super();
}
public Registration(String adminName, String email, String phone, String password) {
	super();
	this.adminName = adminName;
	this.email = email;
	this.phone = phone;
	this.password = password;
}
@Override
public String toString() {
	return "Registration [adminName=" + adminName + ", email=" + email + ", phone=" + phone + ", password=" + password
			+ "]";
}
public String getAdminName() {
	return adminName;
}
public void setAdminName(String adminName) {
	this.adminName = adminName;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}

}