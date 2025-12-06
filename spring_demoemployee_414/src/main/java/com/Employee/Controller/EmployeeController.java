package com.Employee.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Employee.Entity.Employee;
import com.Employee.Service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService service;

	@PostMapping("/addemployee")
	public String addemployee(@RequestBody Employee employee) {
		return service.addemployee(employee);

	}

	@GetMapping("/getemployee")
	public List<Employee> getallemployee() {
		List<Employee> lt = service.getallemployee();
		lt.forEach(System.out::println);
		return lt;
	}

	@GetMapping("/getbyid/{id}")
	public Employee getById(@PathVariable int id) {
		return service.getById(id);
	}

	@PostMapping("/updateemployee/{id}")
	public String updateEmployeeById(@PathVariable int id, @RequestBody Employee employee) {
		return service.updateEmployeeById(id, employee);
	}

	@DeleteMapping("/deletebyid/{id}")
	public String deleteById(@PathVariable int id) {
		return service.deleteById(id);
	}
}
