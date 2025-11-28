package com.Infosys.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Infosys.Entity.Employee;
import com.Infosys.Service.EmployeeService;



@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService sv;
	
	@GetMapping("/getstring/{msg}")
	public String getStringonScreen(@PathVariable String msg) {
		return "hello "+msg; 
	}
	
	@GetMapping("/getempdata")
	public List<Employee> getemployeeData() {
	    List<Employee> lt= sv.getemployeeData();
	    System.out.println(lt);
	    return lt;
	}
	
	
	
	@PostMapping("/addemp")
	public String addEmployee(@RequestBody Employee emp) {
		return sv.addEmployee(emp);
	    
	}
}
