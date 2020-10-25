package com.jwt.spring.boot.demo.service;

import java.util.List;
import java.util.Map;
import com.jwt.spring.boot.demo.exception.ResourceNotFoundException;
import com.jwt.spring.boot.demo.model.Employee;

public interface EmployeeService {

	public List<Employee> getAllEmployees();

	public Employee getEmployeeById(Long employeeId) throws ResourceNotFoundException;

	public Employee createEmployee(Employee employee);

	public Employee updateEmployee(long employeeId, Employee employeeDetails) throws ResourceNotFoundException;

	public Map<String, Boolean> deleteEmployee(Long employeeId) throws ResourceNotFoundException;

}
