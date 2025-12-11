package com.tka.Service;

import java.util.List;

//import java.util.ArrayList;
//import java.util.List;

import org.springframework.stereotype.Service;

import com.tka.DAO.InstagramDAO;
//import com.tka.dto.InstagramDTO;
import com.tka.entity.User;

@Service
public class InstagramService {

	
	private InstagramDAO dao;
	
	public InstagramService(InstagramDAO dao) {
		this.dao=dao;
	}

	public String adduser(User user) {
		if(dao.adduser(user)) {
			return "user added successfully";
		}
		else return null;
	}

	public String addmulitpleuser(List<User> user) {
	if(dao.addmultipleuser(user)) {
		return "Multiple user added successfully";
	}
	return null;
	}

	public List<User> getalluser() {
		return dao.getalluser();
	}

	public List<User> getbystartwithA() {
		return dao.getbystartwithA();
	}

	public List<User> getbyendwithR() {
		return dao.getbyendwithR();
	}

	public List<User> getmobilenoendwith0() {
		return dao.getmobilenoendwith0();
				
	}

	
	
	
//	public User adduser(User user) {
//		
//		return dao.save(user);
//	}
//
//	public List<User> addmultiplerUser(List<User> user) {
//		
//		return dao.saveAll(user);
//	}
//
//	public InstagramDTO getuser(Integer id) {
//	 User us= dao.findById(id).orElse(null);
//	 InstagramDTO dto=new InstagramDTO(us.getId(),us.getName(),us.getEmail(),us.getUsername());
//
//	 return dto;
//	}
//
//	public List<InstagramDTO> getalluserdto() {
//		List<User> us=dao.findAll();
//		List<InstagramDTO> dto=new ArrayList<>();
//		
//		for (User user:us) {
//			dto.add(new InstagramDTO(user.getId(),user.getName(),user.getMobileno(),user.getUsername()));
//		}
//	     return dto;
//	}
//
//
//	public User getbyname(String name) {
//		List<User> user=dao.findAll();
//	      
//		for (User user2 : user) {
//		if(user2.getName().equals(name)) {
//			return user2;
//		}
//	}
//		return  null;
//	}

	
	
	
	
}
