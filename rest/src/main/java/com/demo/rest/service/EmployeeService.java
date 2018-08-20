package com.demo.rest.service;

import java.util.Collection;

import com.demo.rest.dao.EmployeeDao;
import com.demo.rest.pojo.Employee;

public class EmployeeService {
	private EmployeeDao employeeDao=new EmployeeDao();
	public Employee getEmployee(String employeeId) {
		return employeeDao.getEmployee(employeeId);
	}
	public Employee addEmployee(Employee emp) {
		employeeDao.addEmployee(emp);
		return emp;
	}
	public Employee updateEmployee(Employee emp) {
		employeeDao.updateEmployee(emp);
		return emp;
	}
	public void deleteEmployee(String employeeId) {
		employeeDao.deleteEmployee(employeeId);
	}
	public Collection<Employee> getAllEmployee(){
		return employeeDao.getAllEmployee();
	}
}
