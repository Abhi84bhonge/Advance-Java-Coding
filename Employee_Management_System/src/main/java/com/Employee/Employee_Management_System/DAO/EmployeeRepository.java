package com.Employee.Employee_Management_System.DAO;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.yaml.snakeyaml.events.Event.ID;

import com.Employee.Employee_Management_System.Entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

	

}
