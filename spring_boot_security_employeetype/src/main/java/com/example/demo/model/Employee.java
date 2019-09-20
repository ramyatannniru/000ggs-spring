package com.example.demo.model;


	import javax.persistence.*;
	import java.util.HashSet;
	import java.util.Set;
	import java.lang.Long;

	@Entity
	public class Employee  {
	   
		
		
		

		public Employee(Long id, String first_name, String last_name, String email, String employeeType,
				String workHour, String paidamount, String salary, String commission) {
			super();
			this.id = id;
			this.first_name = first_name;
			this.last_name = last_name;
			this.email = email;
			this.employeeType = employeeType;
			this.workHour = workHour;
			this.paidamount = paidamount;
			this.salary = salary;
			this.commission = commission;
		}

		public Employee() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Employee( String first_name, String last_name, String email, String employeeType,
				String workHour, String paidamount, String salary, String commission) {
			super();
			
			this.first_name = first_name;
			this.last_name = last_name;
			this.email = email;
			this.employeeType = employeeType;
			this.workHour = workHour;
			this.paidamount = paidamount;
			this.salary = salary;
			this.commission = commission;
		}		@Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Long id;
		private String first_name;
	    private String last_name;
	    private String email;
	    private String employeeType;
	    private String workHour;
	    private String paidamount;
	    private String salary;
	    private String commission;
	   @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;

	        Employee employee = (Employee) o;

	        return id != null ? id.equals(employee.id) : employee.id == null;
	    }

	    @Override
	    public int hashCode() {
	        return id != null ? id.hashCode() : 0;
	    }

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getFirst_name() {
			return first_name;
		}

		public void setFirst_name(String first_name) {
			this.first_name = first_name;
		}

		public String getLast_name() {
			return last_name;
		}

		public void setLast_name(String last_name) {
			this.last_name = last_name;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getEmployeeType() {
			return employeeType;
		}

		public void setEmployeeType(String employeeType) {
			this.employeeType = employeeType;
		}

		public String getWorkHour() {
			return workHour;
		}

		public void setWorkHour(String workHour) {
			this.workHour = workHour;
		}

		public String getPaidamount() {
			return paidamount;
		}

		public void setPaidamount(String paidamount) {
			this.paidamount = paidamount;
		}

		public String getSalary() {
			return salary;
		}

		public void setSalary(String salary) {
			this.salary = salary;
		}

		public String getCommission() {
			return commission;
		}

		public void setCommission(String commission) {
			this.commission = commission;
		}

		@Override
		public String toString() {
			return "Employee [id=" + id + ", first_name=" + first_name + ", last_name=" + last_name + ", email=" + email
					+ ", employeeType=" + employeeType + ", workHour=" + workHour + ", paidamount=" + paidamount
					+ ", salary=" + salary + ", commission=" + commission + "]";
		}

		


		
		

		

	   
	}


