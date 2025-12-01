package com.Staff.DAO;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Staff.Entity.Staff;

@Repository
public class StaffRepository {

	
	@Autowired
	private SessionFactory sf;
	
	
	public boolean addallEmployee(Staff stf) {
		Session sn=sf.openSession();
		sn.beginTransaction();
		sn.save(stf);
		sn.getTransaction().commit();
		sn.close();
		return true;
		
	}


	public List<Staff> getstaff() {
		Session sn=sf.openSession();
		List<Staff> lt=sn.createQuery("from Staff",Staff.class).list();
		sn.beginTransaction().commit();
		sn.close();
		return lt;
		
	}


	public Staff getstaffbyId() {
		Session sn=sf.openSession();
		Staff stf=sn.get(Staff.class, 1);
		sn.beginTransaction().commit();
		sn.close();
		return stf;
		
	}


	public List<Staff> getsalrymore20k() {
		Session sn=sf.openSession();
		Criteria ct=sn.createCriteria(Staff.class);
		 ct.add(Restrictions.gt("salary", 20000.0));
		 
		List<Staff> lt=ct.list();
		sn.beginTransaction().commit();
		sn.close();
		return lt;
	}

	
	
}
