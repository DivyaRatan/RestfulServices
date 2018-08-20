package com.demo.rest.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.demo.rest.pojo.Employee;

public class EmployeeDao {
		private static final Map<String, Employee> empMap=new HashMap<String, Employee>();
		static {
			initEmps();
		}
		private static void initEmps() {
			Employee emp1=new Employee("E01","Aish");
			Employee emp2=new Employee("E02","Abhi");
			Employee emp3=new Employee("E03","Div");
			Employee emp4=new Employee("E04","Jay");
			empMap.put(emp1.getEmployeeId(), emp1);
			empMap.put(emp2.getEmployeeId(), emp2);
			empMap.put(emp3.getEmployeeId(), emp3);
			empMap.put(emp4.getEmployeeId(), emp4);
		}
		public Employee getEmployee(String employeeId) {
			return empMap.get(employeeId);
		}
		public Employee addEmployee(Employee emp) {
			empMap.put(emp.getEmployeeId(), emp);
			return emp;
		}
		public Employee updateEmployee(Employee emp) {
			empMap.put(emp.getEmployeeId(), emp);
			return emp;
		}
		public void deleteEmployee(String employeeId) {
			empMap.remove(employeeId);
		}
		public Collection<Employee> getAllEmployee(){
			Collection<Employee> e=empMap.values();
			
			return e;
		}
		
}
