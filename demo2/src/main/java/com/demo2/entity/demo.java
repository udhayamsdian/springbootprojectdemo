package com.demo2.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Student")
public class demo {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private int anjanaId;
private String name;
public int getAnjanaId() {
	return anjanaId;
}
public void setAnjanaId(int anjanaId) {
	this.anjanaId = anjanaId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getPhoneNum() {
	return phoneNum;
}
public void setPhoneNum(int phoneNum) {
	this.phoneNum = phoneNum;
}
private int phoneNum;



}