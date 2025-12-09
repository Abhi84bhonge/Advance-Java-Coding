package com.Employee.Employee_Management_System.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Employee.Employee_Management_System.DAO.EmployeeRepository;
import com.Employee.Employee_Management_System.Entity.Employee;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository repo;
	
	
	

	public List<Employee> getallemployee() {
		return repo.findAll();
	}


	public Employee getemployeebyId(Integer id) {
	    return repo.findById(id)
	            .orElseThrow(() -> new RuntimeException("Employee not found"));
	}


	public Employee updateempbyId(Integer id) {
		return repo.findById(id)
				.orElseThrow(() ->new RuntimeException("Employee not found"));
	   
	}

	public void registerEmployee(Employee emp) {
   		repo.save(emp);
}


	public void deleteEmployeeById(Integer id) {
	    Employee emp = repo.findById(id)
	            .orElseThrow(() -> new RuntimeException("Employee not found"));
	    repo.delete(emp);
	}
	

}
