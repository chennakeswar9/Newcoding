package com.springproject.springproject.entity;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Department {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long departmentId;
	@NotBlank(message = "")
	private String departmentname;
	private String departmentaddress;
	@SuppressWarnings({ "unused", "unused" })
	private String departmentcode;
	
	public Department(long departmentId, String departmentname, String departmentaddress, String departmentcode) {
		super();
		this.departmentId = departmentId;
		this.departmentname = departmentname;
		this.departmentaddress = departmentaddress;
		this.departmentcode = departmentcode;
	}
	
	@Override
	public String toString() {
		return "Department [departmentId=" + departmentId + ", departmentname=" + departmentname
				+ ", departmentaddress=" + departmentaddress + ", departmentcode=" + departmentcode + "]";
	}
	
	
	public long getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(long departmentId) {
		this.departmentId = departmentId;
	}
	public String getDepartmentname() {
		return departmentname;
	}
	public void setDepartmentname(String departmentname) {
		this.departmentname = departmentname;
	}
	public String getDepartmentaddress() {
		return departmentaddress;
	}
	public void setDepartmentaddress(String departmentaddress) {
		this.departmentaddress = departmentaddress;
	}
	public String getDepartmentcode() {
		return departmentcode;
	}
	public void setDepartmentcode(String departmentcode) {
		this.departmentcode = departmentcode;
	}
	
	
}
	