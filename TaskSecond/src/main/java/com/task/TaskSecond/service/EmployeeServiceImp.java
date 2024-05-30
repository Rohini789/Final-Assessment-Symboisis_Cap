package com.task.TaskSecond.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.task.TaskSecond.entity.Employee;
import com.task.TaskSecond.repository.EmployeRepository;

@Service
public class EmployeeServiceImp implements EmployeeService{
	private EmployeRepository emprepo;
	@Override
	public Employee saveEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return emprepo.save(emp);
	}


	@Override
	public void deleteEmployee(int id) {
		// TODO Auto-generated method stub
		emprepo.deleteById(id);;
	}

	@Override
	public Employee getById(int id) {
		Optional<Employee>findbyid=	emprepo.findById(id);
		Employee emp=findbyid.get();
			return emp;
	}

	@Override
	public void updateEmployee(Employee emp) {
	    emprepo.existsById(emp.getId());
	        emprepo.save(emp);
	}

	@Override
	public List<Employee> getListOfEmployee() {
		// TODO Auto-generated method stub
		return null;
	}


}