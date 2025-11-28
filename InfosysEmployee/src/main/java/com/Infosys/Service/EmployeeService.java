package com.Infosys.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Infosys.DAO.EmployeeRepository;
import com.Infosys.Entity.Employee;


@Service
public class EmployeeService {

	
	@Autowired
	private EmployeeRepository emprs;
	
	public String addEmployee(Employee emp) {
		
		if(emprs.addEmployee(emp)) {
			return "Employee added";
		}else {
			return "not add employee";
		}
	}

	public List<Employee> getemployeeData() {
	 return emprs.getemployeeData();
		
	}

}
