package com.Employee.Employee_Management_System.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.Employee.Employee_Management_System.Entity.Employee;
import com.Employee.Employee_Management_System.Service.EmployeeService;

@Controller
public class EmployeeController {

	
	@Autowired
	private EmployeeService service;
	@GetMapping("/")
	public String get() {
		return "index";
	}
	
	
//	Register Employee
	
	@GetMapping("/register")
    public String openRegisterPage() {
        return "register";   // loads register.jsp
    }
	

	@PostMapping("/register")
	public String registerEmployee(@ModelAttribute Employee emp) {
		 service.registerEmployee(emp);
	   return "success";
	}
	
	
//	Get All employee
	
	
	@GetMapping("/allemployees")
	public String getallemployee(Model model){
		model.addAttribute("employees",service.getallemployee());
		return "allemployees";
	}
	
	
	
//	Get Employee By ID 
	
	@GetMapping("/getEmpbyId")
	public String showSearchPage() {
	    return "getEmpbyId";
	}

	@PostMapping("/getEmpbyId") 
	public String getEmployeeById(@RequestParam Integer id, Model model) {

		 try {
		        Employee emp = service.getemployeebyId(id);
		        model.addAttribute("emp", emp);
		    } catch (Exception ex) {
		        model.addAttribute("emp", null);
		    }
	    return "getEmpbyId";
	}
	
	
//	Update Employee 

	@GetMapping("/updatebyId")
    public String showUpdateIdPage() {
        return "updatebyId";  
    }
     
	@PostMapping("/updatebyId")
    public String fetchEmployeeForUpdate(@RequestParam Integer id, Model model) {
        try {
            Employee emp = service.getemployeebyId(id);
            model.addAttribute("emp", emp);
        } catch (Exception ex) {
            model.addAttribute("emp", null);
            model.addAttribute("msg", "Employee not found");
        }
        return "updateByIdForm";  
    }
	
	
  @PostMapping("/updateEmployee")
  public String updateEmployee(@ModelAttribute Employee emp,Model model) {
	  service.registerEmployee(emp);
	  model.addAttribute("msg", "Employee Updated Successfully!");
	    return "successupdateemp";
  }
  
  
  //Delete employee by ID
  
  @GetMapping("/deletebyId")
  public String showdeleteIdPage() {
	  return "deletebyId"; 
  }
  
  @PostMapping("/deletebyId")
  public String getempfordelete(@RequestParam Integer id,Model model) {
	
	  try {
          Employee emp = service.getemployeebyId(id);
          model.addAttribute("emp", emp);
      } catch (Exception ex) {
          model.addAttribute("emp", null);
          model.addAttribute("msg", "Employee not found");
      }
	  return "deleteByIdForm";
  }
  
  @PostMapping("/deleteEmployee")
  public String deleteEmployee(@RequestParam Integer id, Model model) {
	    try {
	        service.deleteEmployeeById(id);
	        model.addAttribute("msg", "Employee deleted successfully!");
	    } catch (Exception ex) {
	        model.addAttribute("msg", "Error deleting employee: " + ex.getMessage());
	    }
	    return "successdelete";  // JSP showing success message
	}
  
  
  
}
