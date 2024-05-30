package com.task.TaskSecond.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.task.TaskSecond.entity.Employee;
import com.task.TaskSecond.repository.EmployeRepository;
import com.task.TaskSecond.service.EmployeeService;

import jakarta.validation.Valid;


@Controller
public class EmployeeController {
	@Autowired
	private EmployeeService empservice;
		@GetMapping("/newemployee")
		public String addNewEmp(Model model) {
		 model.addAttribute("newemployee",new Employee());
			return "newemployee";
		}
		@PostMapping("/employeeadded")
		public String getEmployeeStatus(@Valid @ModelAttribute("newemployee") Employee emp,BindingResult bindingresult ,Model model) {
			if(bindingresult.hasErrors()) {
				return "newemployee";
			}
			empservice.saveEmployee(emp);
			model.addAttribute("message","employee added sucessfully");
			return "newemployee";
			
		}
		@GetMapping("/existingemployee")
		public String getExistingEmployee(Model model) {
			List<Employee>existingEmployee=empservice.getListOfEmployee();
			for(Employee b:existingEmployee) {
				System.out.println(b.getFirstname());
			}
			model.addAttribute("employees",existingEmployee);
			return "ExistingEmployee";
			
		}
		@PostMapping("/employee/delete")
		public String deleteEmployee(@RequestParam("id") int id) {
			empservice.deleteEmployee(id);
			return "redirect:/existingemployee";
		
	   }
		@GetMapping("/employee/update")
		public String updateEmployee(@RequestParam("id") int id,Model model) {
			Employee employee=empservice.getById(id);
			model.addAttribute("employee",employee);
			return "update_form";
		}
		
		

}
