package com.Infosys.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Infosys.Entity.Employee;

@Repository
public class EmployeeRepository {

	
	@Autowired
	private SessionFactory sf;
	
	public boolean addEmployee(Employee emp) {
		Session sn = sf.openSession();
        sn.beginTransaction();
        sn.save(emp);
        sn.getTransaction().commit();
        sn.close();
        return true;
	}

	public List<Employee> getemployeeData() {
	Session sn=sf.openSession();
	List<Employee> lt=sn.createQuery("from Employee",Employee.class).list();
	sn.beginTransaction().commit();
	sn.close();
	return lt;
	}

}
