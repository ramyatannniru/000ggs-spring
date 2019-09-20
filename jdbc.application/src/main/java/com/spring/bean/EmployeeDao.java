package com.spring.bean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import com.spring.bean.Employee;

	
	
	/* private DataSource dataSource;
	
	
	public DataSource getDataSource() {
		return dataSource;
	}


	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}


	/*
	 * public void createConnection() { try { Connection
	 * connection=dataSource.getConnection();
	 * System.out.println(connection.toString()); } catch (SQLException e) { // TODO
	 * Auto-generated catch block e.printStackTrace(); } }
	 */
	
/*	public void createEmployee(Employee employee)
	{
	try {
		Connection connection=dataSource.getConnection();
		PreparedStatement pst=connection.prepareStatement("insert into emp(name) values(?)");
		pst.setString(1, employee.getName());
		pst.executeUpdate();
		System.out.println("inseerted..!");
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	} 
	
*/
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDao {
	
	
	//private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public void createEmployee(Employee employee)
	{
		String query="insert into emp( id,name) values(?,?)";
		Object obj[]= {employee.getId(),employee.getName()};
		jdbcTemplate.update(query,obj);
		System.out.println("done");
	}
	
	public List<Employee> getAllEmployee()
	{
		return jdbcTemplate.query("select * from emp", new EmployeeRowmapper());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
	

