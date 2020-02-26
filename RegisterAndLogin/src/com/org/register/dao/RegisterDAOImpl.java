package com.org.register.dao;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.org.register.entity.RegisterEntity;

@Component
public class RegisterDAOImpl implements RegisterDAO {

	@Autowired
	private SessionFactory factory;

	public void setFactory(SessionFactory factory) {
		this.factory = factory;
	}

	public RegisterDAOImpl() {
		System.out.println("Created \t" + this.getClass().getSimpleName());
	}

	public Serializable save(RegisterEntity entity) {
		System.out.println("Invoking save method");
		Session session = null;
		try {

			System.out.println("session created");
			session = factory.openSession();
			System.out.println("Transaction begun");
			session.beginTransaction();
			System.out.println("Entity saving...");
			session.save(entity);
			System.out.println("Commiting....");
			session.getTransaction().commit();
			System.out.println("Data saved");

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("INFO:" + e.getMessage());
		}

		return entity;

	}

}
