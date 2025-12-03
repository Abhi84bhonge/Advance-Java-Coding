package com.IPL.DAO;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class UpdatePlayer {

	@Autowired
	private SessionFactory sf;
	
	public void updateInning() {
		Session sn=sf.openSession();
		
	}
}
