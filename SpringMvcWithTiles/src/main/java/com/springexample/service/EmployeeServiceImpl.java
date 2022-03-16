package com.springexample.service;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springexample.dao.EmployeeDAO;
import com.springexample.model.Employee;
@Transactional
@Service
public class EmployeeServiceImpl implements EmployeeService {
	/**
	 * <h2> employeeDAO</h2>
	 * <p>
	 * employeeDAO
	 * </p>
	 */
	@Autowired
	private EmployeeDAO employeeDAO;
	/**
	 * <h2> saveEmployee </h2>
	 * <p>
	 * to insert new Employee to the employee table
	 * </p>
	 * 
	 * @param employee
	 */
	@Override
	public void saveEmployee(Employee employee) {
		employeeDAO.saveEmployee(employee);
	}

	/**
	 * <h2> updateEmployee </h2>
	 * <p>
	 *to update Employee int the employee table
	 * </p>
	 * 
	 * @param employee
	 */
	@Override
	public void updateEmployee(Employee employee) {
		employeeDAO.updateEmployee(employee);
	}

	/**
	 * <h2> deleteEmployee </h2>
	 * <p>
	 * to delete Employee from the employee table
	 * </p>
	 * 
	 * @param theId
	 */
	@Override
	public void deleteEmployee(int theId) {
		employeeDAO.deleteEmployee(theId);
	}
	/**
	 * <h2> getEmployeeById </h2>
	 * <p>
	 * to get employee by Id
	 * </p>
	 * 
	 * @param theid
	 * @return
	 */
	@Override
	public Employee getEmployeeById(int theid) {
		return employeeDAO.getEmployeeById(theid);
	}
	/**
	 * <h2> getAllEmployees </h2>
	 * <p>
	 * to select all the employees from the employee table
	 * </p>
	 * 
	 * @return
	 */
	@Override
	public List<Employee> getAllEmployees() {
		return this.employeeDAO.getAllEmployees();
	}

}
