package com.task.TaskSecond.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.task.TaskSecond.entity.Employee;

@Repository
public interface EmployeRepository extends JpaRepository<Employee,Long> {
	
	
}
	
	
	
	
