package com.Staff.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Staff.Entity.Staff;
import com.Staff.Service.StaffService;

@RestController
@RequestMapping("/staff")
public class StaffController {

	
	@Autowired
	private StaffService serv;
	
	@PostMapping("/addstaff")
	public String addallEmployee(@RequestBody Staff stf) {
		 serv.addallEmployee(stf);
		return " add employee successfully ";
	}
	
	@GetMapping("/getmsg")
	public String getmds() {
		return "hello";
	}
	
//	@GetMapping("/getallstaff")
//	public String getstaff() {
//	List<Staff> lt=	serv.getstaff();
//	 for (Staff staff : lt) {
//		System.out.println(staff);
//	}
//	return lt+"Employee get successfully ";
//	}
	
//	@GetMapping("/getstaffbyId")
//	public String getstaffbyId() {
//		Staff sf=serv.getstaffbyId();
//	    System.out.println(sf);
//    return sf+" get employee by id successfully";
//	}
	
	@GetMapping("/staffsalaryMore20k")
	public List<Staff> getsalarymore20k() {
		List<Staff> lt=serv.getsalarymore20k();
	     for (Staff staff : lt) {
			System.out.println(staff);
		}
		return lt;
	}
	
	
	
}
