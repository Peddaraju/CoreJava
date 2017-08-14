package com.comparator;

import java.util.Comparator;

public class Employee implements Comparable<Employee>{

	private Integer empId;
	private String empName;
	private Integer age;
	private Double sal;
	
	Employee (Integer empId, String empName, Integer age, Double sal ) {
		this.empId = empId;
		this.empName = empName;
		this.age = age;
		this.sal = sal;
	}
	
	public String toString() {
		return ""+this.empId+","+this.empName+","+this.age+","+this.sal;
	}
	
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Double getSal() {
		return sal;
	}
	public void setSal(Double sal) {
		this.sal = sal;
	}

	@Override
	public int compareTo(Employee emp) {
		return (this.empId < emp.empId)?-1:(this.empId > emp.empId)?1:0;
	}
	
	public static Comparator<Employee> EmpNameSort = new Comparator<Employee>() {

		@Override
		public int compare(Employee emp1, Employee emp2) {
			return emp1.empName.compareTo(emp2.empName);		}
	};
	
	public static Comparator<Employee> EmpNameSame_AgeSort = new Comparator<Employee>() {

		@Override
		public int compare(Employee emp1, Employee emp2) {
			
			if(emp1.empName.compareTo(emp2.empName) == 0) 
				return (emp1.age < emp2.age)?1:(emp1.age > emp2.age)?-1:0;
			return emp1.empName.compareTo(emp2.empName);
		}
	};
}
