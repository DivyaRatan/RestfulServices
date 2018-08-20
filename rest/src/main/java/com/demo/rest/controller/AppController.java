package com.demo.rest.controller;

import java.util.Collection;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import com.demo.rest.pojo.Employee;
import com.demo.rest.service.EmployeeService;

@RestController
public class AppController {

	private EmployeeService employeeserv=new EmployeeService();
	
	@RequestMapping(value="/employee",method=RequestMethod.GET)
	@ResponseBody
	public Collection<Employee> getEmployee(){
		
		return employeeserv.getAllEmployee();
	}
	@RequestMapping(value="/employee/{employeeId}",method=RequestMethod.GET)
	@ResponseBody
	public Employee getEmployee(@PathVariable("employeeId")String employeeId){
		return employeeserv.getEmployee(employeeId);
	}
	@RequestMapping(value="/employee",method=RequestMethod.POST, consumes="application/json")
	@ResponseBody
	public Employee addEmployee(@RequestBody Employee emp){
		System.out.println("Employee Added" + emp.getEmployeeId());
		return employeeserv.addEmployee(emp);
	}
	@RequestMapping(value="/employee",method=RequestMethod.PUT, consumes="application/json")
	@ResponseBody
	public Employee updateEmployee(@RequestBody Employee emp){
		System.out.println("Update Employee" + emp.getEmployeeId());
		return employeeserv.updateEmployee(emp);
	}
	@RequestMapping(value="/employee/{employeeId}",method=RequestMethod.DELETE)
	@ResponseBody
	public void deleteEmployee(@PathVariable String employeeId){
		System.out.println("Deleted Employee" + employeeId);
		employeeserv.deleteEmployee(employeeId);
	}
	
}
