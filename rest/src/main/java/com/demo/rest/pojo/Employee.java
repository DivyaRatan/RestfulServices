package com.demo.rest.pojo;

public class Employee {
		private String EmployeeId;
		private String EmpName;
		
		
		public Employee() {
			
		}

	
		public Employee(String employeeId, String empName) {
			super();
			EmployeeId = employeeId;
			EmpName = empName;
		}

		public String getEmployeeId() {
			return EmployeeId;
		}
		public void setEmployeeId(String employeeId) {
			EmployeeId = employeeId;
		}
		public String getEmpName() {
			return EmpName;
		}
		public void setEmpName(String empName) {
			EmpName = empName;
		}
	
}
