package com.tci.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="department")
public class Department {
	
	@Id
	@GeneratedValue
	long id;
	String departmentName;
	
	
	public Department() {
	}	
	public Department( String departmentName) {
		this.departmentName = departmentName;
	}
	
	public Department(long id, String departmentName) {
		this.id = id;
		this.departmentName = departmentName;
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	@Override
	public String toString() {
		return "Department [id=" + id + ", departmentName=" + departmentName + "]";
	}	

}
