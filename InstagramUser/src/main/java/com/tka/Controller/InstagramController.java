package com.tka.Controller;

import java.util.List;

//import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.tka.Service.InstagramService;
//import com.tka.dto.InstagramDTO;
import com.tka.entity.User;

@RestController
@RequestMapping("/www.instagram.com")
public class InstagramController {

	private final InstagramService service;
	
	public InstagramController(InstagramService service) {
		this.service=service;
	}
	
	@GetMapping("/getmsg")
	public String getmsg() {
		return "Hello in Instagram";
	}
	
	//HIBERNATE 
	
	@PostMapping("/adduser")
	public String adduser(@RequestBody User user) {
		return service.adduser(user);
	}
	
	@PostMapping("/addmultipleuser")
	public String addmultipleuser(@RequestBody List<User> user) {
		return service.addmulitpleuser(user);
	}
	
	@GetMapping("/getalluser")
	public List<User> getalluser(){
		return service.getalluser();
	}
	
	@GetMapping("/getbystartwithA")
	public List<User> getbystartwithA(){
		return service.getbystartwithA();
	}
	
	
	@GetMapping("/getbyendwithR")
	public List<User> getbyendwithR(){
		return service.getbyendwithR();
	}
	
	@GetMapping("/getmobilenoendwith0")
	public List<User> getmobilenoendwith0(){
		return service.getmobilenoendwith0();
	}
//	JPA REPOSITORY
	
	
//	@PostMapping("/adduser")
//	public User adduser(@RequestBody User user){
//		return service.adduser(user);
//	}
//	
//	@PostMapping("/addmultiplerUser")
//	public List<User>  addmultipleEmployee(@RequestBody List<User> user){
//		return service.addmultiplerUser(user);
//	}
//	
//	@GetMapping("/getuser/{id}")
//	public InstagramDTO getuser(@PathVariable Integer id) {
//		return service.getuser(id);
//	}
//	
//	@GetMapping("/getalluserdto")
//	public List<InstagramDTO> getalluserdto(){
//		return service.getalluserdto();
//	}
//	
//	@GetMapping("/getbyname/{name}")
//	public User getbyname(@PathVariable String name) {
//		return service.getbyname(name);
//			
//		}
	
	
	
	}
	
	