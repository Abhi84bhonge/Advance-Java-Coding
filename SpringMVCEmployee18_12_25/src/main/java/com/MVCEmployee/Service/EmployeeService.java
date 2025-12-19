package com.MVCEmployee.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.MVCEmployee.DAO.EmployeeDAO;
import com.MVCEmployee.Entity.Employee;

@Service
public class EmployeeService {

	private final EmployeeDAO edao;

	public EmployeeService(EmployeeDAO edao) {
		this.edao = edao;
	}

	public void addEmployee(Employee emp) {
		if (edao.save(emp) != null) {
			System.err.println("employee added successfully!!!");
		}
	}

	public List<Employee> showEmployees() {
		return edao.findAll();
	}

	public void deleteEmployee(int id) {
		edao.deleteById(id);
	}

	public Employee getEmployeeById(int id) {
		return edao.findById(id).orElse(null);
	}

	public void updateEmployee(Employee emp) {
		edao.save(emp);
	}

}
