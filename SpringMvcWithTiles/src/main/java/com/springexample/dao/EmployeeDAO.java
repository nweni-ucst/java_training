package com.springexample.dao;

import java.util.List;

import com.springexample.model.Employee;
/**
 * <h2>EmployeeDAO Class</h2>
 * <p>
 * Process for Displaying EmployeeDAO
 * </p>
 * 
 * @author NweNi
 *
 */
public interface EmployeeDAO {
	/**
	 * <h2>saveEmployee</h2>
	 * <p>
	 * to insert new Employee to the employee table
	 * </p>
	 *
	 * @param employee Employee
	 * @return void
	 */
	public void saveEmployee(Employee employee);
	/**
	 * <h2>updateEmployee</h2>
	 * <p>
	 * to update Employee int the employee table
	 * </p>
	 *
	 * @param employee Employee
	 * @return void
	 */
	public void updateEmployee(Employee employee);
	/**
	 * <h2>deleteEmployee</h2>
	 * <p>
	 * to delete Employee from the employee table
	 * </p>
	 *
	 * @param id int
	 * @return void
	 */
	public void deleteEmployee(int id);
	/**
	 * <h2>getEmployeeById</h2>
	 * <p>
	 *get employee by Id
	 * </p>
	 *
	 * @param id int
	 * @return
	 * @return Employee
	 */
	public Employee getEmployeeById(int id);
	/**
	 * <h2>getAllEmployees</h2>
	 * <p>
	 * to select all the employees from the employee table
	 * </p>
	 *
	 * @return
	 * @return List<Employee>
	 */
	public List<Employee> getAllEmployees();
}
