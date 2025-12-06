package com.Employee.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Employee.DAO.EmployeeRepository;
import com.Employee.Entity.Employee;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository rs;

	public String addemployee(Employee employee) {

		return "employee added" + rs.save(employee);

	}

	public List<Employee> getallemployee() {
		return rs.findAll();
	}

	public Employee getById(int id) {
		return rs.findById(id).orElse(null);

	}

	public String updateEmployeeById(int id, Employee employee) {
		Employee existing = rs.getById(id);

		existing.setName(employee.getName());
		existing.setMobileno(employee.getMobileno());
		existing.setProfile(employee.getProfile());
		existing.setSalary(employee.getSalary());
		rs.save(existing);

		return "employee added successfully!!";
	}

	public String deleteById(int id) {
		if (id > 0) {
			rs.deleteById(id);
			return id + " ID Employee deleted successfully ";
		} else {
			return "Id not found!!!";
		}

	}
}
