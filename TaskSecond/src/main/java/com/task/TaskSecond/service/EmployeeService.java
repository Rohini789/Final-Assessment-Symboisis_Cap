package com.task.TaskSecond.service;

import java.util.List;


import com.task.TaskSecond.entity.Employee;



public interface EmployeeService {
	
		
		public Employee saveEmployee(Employee employee);
		
		public List<Employee> getListOfEmployee();
		
		public void updateEmployee(Employee employee);
		
		public void deleteEmployee(int id);
		
		public Employee getById(int id);

	
		
		
		
	


	}


