package com.zensar.rest;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.zensar.bean.Employee;
import com.zensar.service.EmployeeService;

@RestController
@RequestMapping("/Admin")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	@PostMapping("/addemployee")
	private Employee saveEmployee(@RequestBody Employee employee) {
		employeeService.create(employee);
		
		return  employee;
	}
	
	@GetMapping("/getemployees")
	private List<Employee> getAllEmployee(){
		return employeeService.read();
	}
	
	@GetMapping("/getemployee/{id}")
	private Employee getEmployeeById(@PathVariable("id") long id) {
		return employeeService.readById(id);
	}
	
	@PostMapping("/updateemployee/{id}")
	private Employee update(@PathVariable Long id,@RequestBody Employee employeeDetails) {
		Employee employee = employeeService.readById(id);
		employee.setName(employeeDetails.getName());
		employee.setEmail(employeeDetails.getEmail());
		employee.setGender(employeeDetails.getGender());
		employee.setRole(employeeDetails.getRole());
		employee.setAddress(employeeDetails.getAddress());
	
		 employeeService.update(employee);
		 return employee;		
	}
	
	@DeleteMapping("/deleteemployee/{id}")
	private String deleteEmployee(@PathVariable("id") long id) {
		employeeService.delete(id);
		return "Successfully Deleted";
	}
}
