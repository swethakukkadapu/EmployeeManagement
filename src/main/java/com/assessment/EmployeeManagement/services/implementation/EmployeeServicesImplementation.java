package com.assessment.EmployeeManagement.services.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.assessment.EmployeeManagement.entity.Employee;
import com.assessment.EmployeeManagement.exception.EmployeeAlreadyExistsException;
import com.assessment.EmployeeManagement.repository.EmployeeRepository;
import com.assessment.EmployeeManagement.services.EmployeeServices;

@Service
public class EmployeeServicesImplementation implements EmployeeServices{
	
	@Autowired
	private EmployeeRepository employeeRepository;
	@Override
	public Employee addEmployee(Employee employee) {
		if(employeeRepository.existsById(employee.getId())) {
			throw new EmployeeAlreadyExistsException("Employee Already Exists");
			
		}
		return employeeRepository.save(employee);
	}
	@Override
	public List<Employee> getEmployees() {
		return employeeRepository.findAll();
	}
	@Override
	public Employee updateEmployee(Integer id, Employee employee) {
		Employee emp = employeeRepository.findById(id).get();
		if(0 < employee.getSalary()) {
			emp.setSalary(employee.getSalary());
		}
		return employeeRepository.save(emp);
	}
	@Override
	public List<Employee> descendingSalary() {
		return employeeRepository.findByOrderBySalaryDesc();
	}
	@Override
	public List<Employee> getEmployeesBySorting() {
		List<Employee> list = employeeRepository.findAll(Sort.by("salary").descending().and(Sort.by("name")));
		return list;
	}
	
	
	

}
