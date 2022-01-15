package com.assessment.EmployeeManagement.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	private Integer id;
	private String name;
	private double salary;
	private String designiation;
	
	public Employee() {
	}

	public Employee(Integer id, String name, double salary, String designiation) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.designiation = designiation;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDesigniation() {
		return designiation;
	}

	public void setDesigniation(String designiation) {
		this.designiation = designiation;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", designiation=" + designiation + "]";
	
	}
	
	

}
