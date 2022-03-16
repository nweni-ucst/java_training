package com.springexample.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.springexample.model.Employee;
/**
 * <h2>EmployeeDAOImpl Class</h2>
 * <p>
 * Process for Displaying EmployeeDAOImpl
 * </p>
 * 
 * @author NweNi
 *
 */
@Repository
@Qualifier
public class EmployeeDAOImpl implements EmployeeDAO {
	@Autowired
	private SessionFactory sessionFactory;
	/**
	 * <h2>saveEmployee</h2>
	 * <p>
	 * to insert new Employee to the employee table
	 * </p>
	 * 
	 * @param employee
	 */
	@Override
	public void saveEmployee(Employee employee) {
		Session session = sessionFactory.getCurrentSession();
		session.save(employee);
	}
	/**
	 * <h2>updateEmployee</h2>
	 * <p>
	 * Updating a particular Employee
	 * </p>
	 * 
	 * @param employee
	 */
	@Override
	public void updateEmployee(Employee employee) {
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.update(employee);
	}
	/**
	 * <h2>deleteEmployee</h2>
	 * <p>
	 * Deletion of a particular Employee
	 * </p>
	 * 
	 * @param id int
	 */
	@Override
	public void deleteEmployee(int id) {
		Session session = sessionFactory.getCurrentSession();
		Employee employee = (Employee) session.get(Employee.class, id);
		if (null != employee) {
			session.delete(employee);
		}
	}
	/**
	 * <h2>getEmployeeById</h2>
	 * <p>
	 * getter method for Employee by Id
	 * </p>
	 * 
	 * @param id int
	 * @return
	 */
	@Override
	public Employee getEmployeeById(int id) {
		Session currentSession = sessionFactory.getCurrentSession();
		Employee emp = currentSession.get(Employee.class, id);
		return emp;
	}
	/**
	 * <h2>getAllEmployees</h2>
	 * <p>
	 * to select all the Employee from the employee table
	 * </p>
	 * 
	 * @return List
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Employee> getAllEmployees() {
		return sessionFactory.getCurrentSession().createQuery("from Employee").list();
	}
}
