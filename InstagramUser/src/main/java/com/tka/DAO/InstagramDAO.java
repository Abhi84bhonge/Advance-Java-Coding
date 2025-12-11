package com.tka.DAO;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Repository;

import com.tka.entity.User;

//@Repository
//public interface InstagramDAO extends JpaRepository<User, Integer> {

@Repository
public class InstagramDAO {

	private SessionFactory sf;

	public InstagramDAO(SessionFactory sf) {
		this.sf = sf;
	}

	public boolean adduser(User user) {
		Session sn = sf.openSession();
		sn.save(user);
		sn.beginTransaction().commit();
		sn.close();
		return true;
	}

	public boolean addmultipleuser(List<User> user) {
		Session sn=sf.openSession();
		for(User u:user) {
			sn.save(u);
		}
		sn.beginTransaction().commit();
		sn.close();
		return true;
		
	}

	public List<User> getalluser() {
		Session sn=sf.openSession();
		List<User> lt=sn.createQuery("from User",User.class).list();
		return lt;
	}

	public List<User> getbystartwithA() {
	  Session sn=sf.openSession();
	  Criteria ct=sn.createCriteria(User.class);
	  ct.add(Restrictions.like("name", "A%"));
	  return ct.list();
	}

	public List<User> getbyendwithR() {
		Session sn=sf.openSession();
		Criteria ct=sn.createCriteria(User.class);
		ct.add(Restrictions.like("name", "%v"));
		return ct.list();
	}

	public List<User> getmobilenoendwith0() {
		Session sn=sf.openSession();
		Criteria ct=sn.createCriteria(User.class);
		ct.add(Restrictions.like("mobileno", "%0"));
		return ct.list();
	}	  
	  
	  

}