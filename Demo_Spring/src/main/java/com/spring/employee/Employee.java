/**
 * 
 */
package com.spring.employee;



public class Employee {

	public Employee(String fname, String lname, String email, String address, String phnumber) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.address = address;
		this.phnumber = phnumber;
	}
	
	
	private String fname;
	private String lname;
	private String email;
    private String phnumber;
    private String address;
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public String getFanme() {
		return fname;
	}
	public void setFanme(String fanme) {
		this.fname = fanme;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Employee [fanme=" + fname + ", lname=" + lname + ", email=" + email + ", address=" + address
				+ ", phnumber=" + phnumber + "]";
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhnumber() {
		return phnumber;
	}
	public void setPhnumber(String phnumber) {
		this.phnumber = phnumber;
	}
	

}
