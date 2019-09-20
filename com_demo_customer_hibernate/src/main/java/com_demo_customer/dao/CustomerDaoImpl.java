package com_demo_customer.dao;

import javax.annotation.PostConstruct;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com_demo_customer.entity.Customer;



@Repository

public class CustomerDaoImpl implements CustomerDao {

	@Autowired
	private SessionFactory sessionFactory;
	private Session session;
	public CustomerDaoImpl() {
		super();
	}
	@PostConstruct
	public void createSession()
	{
		session=sessionFactory.openSession();
	}
	

	public CustomerDaoImpl(SessionFactory sessionFactory) {
		super();
		this.sessionFactory = sessionFactory;
	}


	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}


	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}


	@Transactional
	public void createCustomer(Customer theCustomer) {
		
		session.saveOrUpdate(theCustomer);
	}

}
