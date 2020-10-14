package com.HR.MODEL;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="emp")
public class employee {
@Id
@Column(columnDefinition="varchar(27)",name="employee_id")
private String emp_id;
@Column(columnDefinition="varchar(27)",name="employee_name")
private String emp_name;
@Column(columnDefinition="varchar(12)",name="department")
private String dept ;
@Column(name="experince")
private double exp;
@Column(columnDefinition="varchar(30)")
private String designation;
@Transient
private salary_info inf;
public String getEmp_id() {
	return emp_id;
}
public salary_info getInf() {
	return inf;
}
public void setInf(salary_info inf) {
	this.inf = inf;
}
public void setEmp_id(String emp_id) {
	this.emp_id = emp_id;
}
public String getEmp_name() {
	return emp_name;
}
public void setEmp_name(String emp_name) {
	this.emp_name = emp_name;
}
public String getDept() {
	return dept;
}
public void setDept(String dept) {
	this.dept = dept;
}
public double getExp() {
	return exp;
}
public void setExp(double exp) {
	this.exp = exp;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
public employee() {
	super();
	// TODO Auto-generated constructor stub
}

}
