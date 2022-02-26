package com.springexample;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
/**
 * <h2>EmployeeDAOImpl Class</h2>
 * <p>
 * Process for Displaying EmployeeDAOImpl
 * </p>
 * 
 * @author NweNi
 *
 */
public class EmployeeDAOImpl implements EmployeeDAO {
	/**
	 * <h2>jdbcTemplate</h2>
	 * <p>
	 * creating object for jdbcTemplate
	 * </p>
	 */
	private JdbcTemplate jdbcTemplate;
	/**
	 * <h2>setJdbcTemplate</h2>
	 * <p>
	 * setter method for JdbcTemplate
	 * </p>
	 *
	 * @param jdbcTemplate JdbcTemplate
	 * @return void
	 */
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	// Saving a new Employee
	/**
	 * <h2>saveEmployee</h2>
	 * <p>
	 * to insert new Employee to the employee table
	 * </p>
	 * 
	 * @param employee
	 */
	public void saveEmployee(Employee employee) {
		String sql = "insert into Employee values(?,?,?,?)";
		jdbcTemplate.update(sql,
				new Object[] { employee.getId(), employee.getName(), employee.getDept(), employee.getAge() });
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
	@SuppressWarnings({ "unchecked", "rawtypes", "deprecation" })
	public Employee getEmployeeById(int id) {
		String sql = "select * from Employee where id=?";
		Employee employee = (Employee) jdbcTemplate.queryForObject(sql, new Object[] { id }, new RowMapper() {
			/**
			 * <h2>mapRow</h2>
			 * <p>
			 * mapping Employee object with database
			 * </p>
			 * 
			 * @param rs     ResultSet
			 * @param rowNum int
			 * @return
			 * @throws SQLException
			 */
			@Override
			public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
				Employee employee = new Employee();
				employee.setId(rs.getInt(1));
				employee.setName(rs.getString(2));
				employee.setDept(rs.getString(3));
				employee.setAge(rs.getInt(4));
				return employee;
			}
		});
		return employee;
	}
	/**
	 * <h2>getAllEmployees</h2>
	 * <p>
	 * to select all the Employee from the employee table
	 * </p>
	 * 
	 * @return
	 */
	public List<Employee> getAllEmployees() {
		// string variable for to write query
		String sql = "select * from Employee";
		List<Employee> employeeList = jdbcTemplate.query(sql, new ResultSetExtractor<List<Employee>>() {
			@Override
			public List<Employee> extractData(ResultSet rs) throws SQLException, DataAccessException {
				List<Employee> list = new ArrayList<Employee>();
				while (rs.next()) {
					Employee employee = new Employee();
					employee.setId(rs.getInt(1));
					employee.setName(rs.getString(2));
					employee.setDept(rs.getString(3));
					employee.setAge(rs.getInt(4));
					list.add(employee);
				}
				return list;
			}
		});
		return employeeList;
	}
	/**
	 * <h2>updateEmployee</h2>
	 * <p>
	 * Updating a particular Employee
	 * </p>
	 * 
	 * @param employee
	 */
	public void updateEmployee(Employee employee) {
		String sql = "update Employee set name=?,dept=?, age =?  where id=?";
		jdbcTemplate.update(sql,
				new Object[] { employee.getId(), employee.getName(), employee.getDept(), employee.getAge() });
	}
	/**
	 * <h2>deleteEmployee</h2>
	 * <p>
	 * Deletion of a particular Employee
	 * </p>
	 * 
	 * @param id int
	 */
	public void deleteEmployee(int id) {
		String sql = "delete from employee where id=?";
		jdbcTemplate.update(sql, new Object[] { id });
	}
}
