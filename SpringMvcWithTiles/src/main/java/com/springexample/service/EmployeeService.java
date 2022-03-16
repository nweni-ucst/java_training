package com.springexample.service;
import java.util.List;

import org.springframework.stereotype.Service;
import com.springexample.model.Employee;
@Service
public interface EmployeeService {
	/**
	 * <h2> saveEmployee</h2>
	 * <p>
	 * to insert new Employee to the employee table
	 * </p>
	 *
	 * @param employee
	 * @return void
	 */
	public void saveEmployee(Employee employee);
	/**
	 * <h2> updateEmployee</h2>
	 * <p>
	 * to update Employee int the employee table
	 * </p>
	 *
	 * @param employee
	 * @return void
	 */
	public void updateEmployee(Employee employee);

	/**
	 * <h2> deleteEmployee</h2>
	 * <p>
	 * to delete Employee from the employee table
	 * </p>
	 *
	 * @param theId
	 * @return void
	 */
	public void deleteEmployee(int theId);
	
	/**
	 * <h2> getEmployeeById</h2>
	 * <p>
	 * to get employee by Id
	 * </p>
	 *
	 * @param theid
	 * @return
	 * @return Employee
	 */
	public Employee getEmployeeById(int theid);
	
	/**
	 * <h2> getAllEmployees</h2>
	 * <p>
	 * to select all the employees from the employee table
	 * </p>
	 *
	 * @return
	 * @return List<Employee>
	 */
	public List<Employee> getAllEmployees();
}
