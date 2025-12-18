package com.ImplementMVC.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MVCController {

	
	
	@GetMapping("index")
	public String getmsg() {
		return "index";
	}
//	
//	
//	@GetMapping("employee")
//	public String getemployee() {
//		
//		return "employee";
//	}
//
//   @PostMapping("welcome")
//   public String welcome(@RequestParam("city") String city,@RequestParam ("username") String uname,Model m) {
//	   m.addAttribute("xyz",uname);
//	   m.addAttribute("city",city);
//    return "welcome";
//   }

   
   
   
   //extra work 
   
   @GetMapping("gotoaddemployee")
   public String gotoemployee() {
	   return "gotoaddemployee";
   }
   
   @GetMapping("addemployee")
   public String addemployee() {
	   return "addemployee";
   }
   
   @PostMapping("getemployee")
   public String gemployee(@RequestParam ("name") String name,@RequestParam ("city") String city,Model m) {
	   m.addAttribute("name",name);
	   m.addAttribute("city",city);
	   return "getemployee";
   }
   
   
}

