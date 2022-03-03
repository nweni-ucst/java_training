package com.springexample.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Range;

/**
 * <h2>Employee Class</h2>
 * <p>
 * Process for Displaying Employee
 * </p>
 * 
 * @author NweNi
 *
 */
@Entity
@Table(name = "employee")
public class Employee implements Serializable {
	/**
	 * <h2>serialVersionUID</h2>
	 * <p>
	 * serialVersionUID final
	 * </p>
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * <h2>id</h2>
	 * <p>
	 * id Integer
	 * </p>
	 */
	@NotNull
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "ID")
	private Integer id;
	/**
	 * <h2>name</h2>
	 * <p>
	 * name String
	 * </p>
	 */
	@NotNull
	@Column(name = "NAME")
	private String name;
	/**
	 * <h2>age</h2>
	 * <p>
	 * age Integer
	 * </p>
	 */
	@NotNull
	@Range(min = 18, max = 65)
	@Column(name = "AGE")
	private Integer age;
	/**
	 * <h2>dept</h2>
	 * <p>
	 * dept String
	 * </p>
	 */
	@NotNull
	@Column(name = "DEPT")
	private String dept;
	/**
	 * <h2>Constructor for Employee</h2>
	 * <p>
	 * Constructor for Employee
	 * </p>
	 * 
	 * @return
	 */
	public Employee() {
		super();
	}
	/**
	 * <h2>Constructor for Employee</h2>
	 * <p>
	 * Constructor for Employee with parameters
	 * </p>
	 * 
	 * @param id   Integer
	 * @param name String
	 * @param age  Integer
	 * @param dept String
	 */
	public Employee(Integer id, String name, Integer age, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.dept = dept;
	}
	/**
	 * <h2>getId</h2>
	 * <p>
	 * getter method for Id
	 * </p>
	 *
	 * @return id
	 * @return Integer
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * <h2>setId</h2>
	 * <p>
	 * setter method for Id
	 * </p>
	 *
	 * @param id Integer
	 * @return void
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * <h2>getName</h2>
	 * <p>
	 * getter method for Name
	 * </p>
	 *
	 * @return name
	 * @return String
	 */
	public String getName() {
		return name;
	}
	/**
	 * <h2>setName</h2>
	 * <p>
	 * setter method for name
	 * </p>
	 *
	 * @param name String
	 * @return void
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * <h2>getAge</h2>
	 * <p>
	 * getter method for Age
	 * </p>
	 *
	 * @return age
	 * @return Integer
	 */
	public Integer getAge() {
		return age;
	}
	/**
	 * <h2>setAge</h2>
	 * <p>
	 * setter method for Age
	 * </p>
	 *
	 * @param age Integer
	 * @return void
	 */
	public void setAge(Integer age) {
		this.age = age;
	}
	/**
	 * <h2>getDept</h2>
	 * <p>
	 * getter method for Department
	 * </p>
	 *
	 * @return dept
	 * @return String
	 */
	public String getDept() {
		return dept;
	}
	/**
	 * <h2>setDept</h2>
	 * <p>
	 * setter method for dept
	 * </p>
	 *
	 * @param dept String
	 * @return void
	 */
	public void setDept(String dept) {
		this.dept = dept;
	}
	/**
	 * <h2>toString</h2>
	 * <p>
	 * toString method()
	 * </p>
	 * 
	 * @return String
	 */
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", dept=" + dept + "]";
	}
}
