package com.springexample.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.springexample.model.Employee;
import com.springexample.service.EmployeeService;
/**
 * <h2>EmployeeController Class</h2>
 * <p>
 * Process for Displaying EmployeeController
 * </p>
 * 
 * @author NweNi
 *
 */
@Controller
public class EmployeeController {
	/**
	 * <h2>EmployeeService</h2>
	 * <p>
	 * creating an object:EmployeeService
	 * </p>
	 */
	@Autowired
	private EmployeeService empService;
	/**
	 * <h2>listEmployees</h2>
	 * <p>
	 * getAllEmployees from the employee table
	 * </p>
	 *
	 * @param model ModelAndView
	 * @return
	 * @throws IOException
	 * @return ModelAndView model
	 */
	@RequestMapping(value = "/employees")
	public ModelAndView listEmployees(ModelAndView model) throws IOException {
		List<Employee> employeeList = empService.getAllEmployees();
		model.addObject("employeeList", employeeList);
		model.addObject("employee", new Employee());
		model.setViewName("employees");
		return model;
	}
	/**
	 * <h2>removeemployee</h2>
	 * <p>
	 * delete employee from the employee table
	 * </p>
	 *
	 * @param id int
	 * @return
	 * @return String
	 */
	@RequestMapping("/delete/{id}")
	public String removeemployee(@PathVariable("id") int id) {
		empService.deleteEmployee(id);
		return "redirect:/employees";
	}
	/**
	 * <h2>addemployee</h2>
	 * <p>
	 * insert/update employee to the employee table
	 * </p>
	 *
	 * @param employee Employee
	 * @return
	 * @return String
	 */
	@RequestMapping(value = "/employee/add", method = RequestMethod.POST)
	public String addemployee(@ModelAttribute("employee") Employee employee) {
		if (empService.getEmployeeById(employee.getId()) == null) {
			// new employee, add it
			empService.saveEmployee(employee);
		} else {
			// existing employee, call update
			empService.updateEmployee(employee);
		}
		return "redirect:/employees";
	}
	/**
	 * <h2>updateEmployee</h2>
	 * <p>
	 * update employee
	 * </p>
	 *
	 * @param id int
	 * @param model Model
	 * @return
	 * @return String
	 */
	@RequestMapping("/edit/{id}")
	public String updateEmployee(@PathVariable("id") int id, Model model) {
		model.addAttribute("employee", empService.getEmployeeById(id));
		model.addAttribute("employeeList", empService.getAllEmployees());
		return "employees";
	}
}
