package com.Staff.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Staff.DAO.StaffRepository;
import com.Staff.Entity.Staff;

@Service
public class StaffService {
	
	@Autowired
	private StaffRepository srepo;

	public String  addallEmployee(Staff stf) {
		if(srepo.addallEmployee(stf)) {
			return "Employee added successfully";
		}else {
			return "Employee not addedd";
		}
		
	}

	public List<Staff> getstaff() {
		
		return srepo.getstaff();
	}

	public Staff getstaffbyId() {
		return srepo.getstaffbyId();
		
	}

	public List<Staff> getsalarymore20k() {
		return srepo.getsalrymore20k();
		
	}

}
