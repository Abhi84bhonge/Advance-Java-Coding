package com.MVCEmployee.Controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestParam;

import com.MVCEmployee.Entity.Employee;
import com.MVCEmployee.Service.EmployeeService;

@Controller
public class EmployeeController {

	private final EmployeeService es;

	public EmployeeController(EmployeeService es) {
		this.es = es;
	}

	@GetMapping("index")
	public String getindexpage() {
		return "index";
	}

	@GetMapping("getemployee-data")
	public String getemployeeData() {
		return "getemployee-data";
	}

	@PostMapping("addemployee")
	public String addEmployee(@ModelAttribute Employee emp) {
		es.addEmployee(emp);
		return "redirect:/showemployees";
	}

	@GetMapping("showemployees")
	public String showEmployees(Model model) {
		List<Employee> emp = es.showEmployees();
		model.addAttribute("emp", emp);
		return "showemployees";
	}

	@GetMapping("deleteemployee")
	public String deleteEmployee(@RequestParam int id) {
		es.deleteEmployee(id);
		return "redirect:/showemployees";
	}

	@GetMapping("updateemployee")
	public String updateEmployee(@RequestParam int id, Model model) {
		Employee emp = es.getEmployeeById(id);
		model.addAttribute(emp);
		return "updateemployee";
	}

	@PostMapping("updateemployee")
	public String updateEmployee(@ModelAttribute Employee emp) {
		es.updateEmployee(emp);
		return "redirect:/updateemployee";
	}

	
	
	
	

//	@PostMapping("addemployee")
//	public String addEmployee(@RequestParam String name,@RequestParam String role,@RequestParam double salary) {
//	   System.out.println(name+" "+role+" "+salary);
//		return "index";
//	}
	
	
}
