package com.MVCEmployee.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.MVCEmployee.Entity.Employee;

@Repository
public interface EmployeeDAO extends JpaRepository<Employee, Integer>{

}
