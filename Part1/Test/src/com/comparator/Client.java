package com.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Client {
	
	public static void main(String[] args) {
		List<Employee> e = new ArrayList<Employee>();
		e.add(new Employee(4, "Raju", 24, 30000.00));
		e.add(new Employee(3, "Adi", 26, 40000.00));
		e.add(new Employee(1, "Chandra", 25, 35000.00));
		e.add(new Employee(2, "Abbi", 24, 3000.00));
		e.add(new Employee(5, "Raju", 25, 30000.00));
		e.add(new Employee(5, "Raju", 25, 35000.00));
		for (Iterator iterator = e.iterator(); iterator.hasNext();) {
			Employee employee = (Employee) iterator.next();
			System.out.println(employee.getEmpId()+"\t"+employee.getEmpName()+"\t"+employee.getAge()+"\t"+employee.getSal());
		}
		Collections.sort(e);
		System.out.println("------------sorting based on empId---------");
		for (Iterator iterator = e.iterator(); iterator.hasNext();) {
			Employee employee = (Employee) iterator.next();
			System.out.println(employee.getEmpId()+"\t"+employee.getEmpName()+"\t"+employee.getAge()+"\t"+employee.getSal());
		}
		
		System.out.println("------------sorting based on empName---------");
		Collections.sort(e, Employee.EmpNameSort);
		for (Iterator iterator = e.iterator(); iterator.hasNext();) {
			Employee employee = (Employee) iterator.next();
			System.out.println(employee.getEmpId()+"\t"+employee.getEmpName()+"\t"+employee.getAge()+"\t"+employee.getSal());
		}
		
		System.out.println("------------EmpNames are same then sorting based on Higher Age---------");
		Collections.sort(e, Employee.EmpNameSame_AgeSort);
		for (Iterator iterator = e.iterator(); iterator.hasNext();) {
			Employee employee = (Employee) iterator.next();
			System.out.println(employee.getEmpId()+"\t"+employee.getEmpName()+"\t"+employee.getAge()+"\t"+employee.getSal());
		}

	}

}
