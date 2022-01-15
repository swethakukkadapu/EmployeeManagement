package com.assessment.EmployeeManagement.services;

import java.util.List;

import com.assessment.EmployeeManagement.entity.Employee;

public interface EmployeeServices {

	public Employee addEmployee(Employee employee);

	public List<Employee> getEmployees();

	public Employee updateEmployee(Integer id, Employee employee);

	public List<Employee> descendingSalary();

	public List<Employee> getEmployeesBySorting();

}
