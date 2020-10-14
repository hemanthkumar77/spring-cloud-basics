package com.HR.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SALARY")
public class salary_info {
@Id
private String id;
@Column(name="salary")
private double take_home;
@Column(name="Tax")
private double tax;
@Column(name="Bonus")
private double bonus;
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public double getTake_home() {
	return take_home;
}
public void setTake_home(double take_home) {
	this.take_home = take_home;
}
public double getTax() {
	return tax;
}
public void setTax(double tax) {
	this.tax = tax;
}
public double getBonus() {
	return bonus;
}
public void setBonus(double bonus) {
	this.bonus = bonus;
}
public salary_info() {
	super();
	// TODO Auto-generated constructor stub
}
}
