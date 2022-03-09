package ojt.student.crud.bl.dto;

import java.io.Serializable;
import java.util.Date;

import ojt.student.crud.persistence.entity.Student;
/**
 * <h2> StudentDTO Class</h2>
 * <p>
 * Process for Displaying StudentDTO
 * </p>
 * 
 * @author NweNi
 *
 */
public class StudentDTO implements Serializable {
	/**
	 * <h2>serialVersionUID</h2>
	 * <p>
	 * serialVersionUID
	 * </p>
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * <h2>id</h2>
	 * <p>
	 * id
	 * </p>
	 */
	private int id;
	/**
	 * <h2>rollNumber</h2>
	 * <p>
	 * rollNumber
	 * </p>
	 */
	private String rollNumber;
	/**
	 * <h2>name</h2>
	 * <p>
	 * name
	 * </p>
	 */
	private String name;
	/**
	 * <h2>major</h2>
	 * <p>
	 * major
	 * </p>
	 */
	private String major;
	/**
	 * <h2>year</h2>
	 * <p>
	 * year
	 * </p>
	 */
	private String year;

	/**
	 * <h2>email</h2>
	 * <p>
	 * email
	 * </p>
	 */
	private String email;
	/**
	 * <h2>dob</h2>
	 * <p>
	 * dob
	 * </p>
	 */
	private String dob;
	/**
	 * <h2>createdAt</h2>
	 * <p>
	 * createdAt
	 * </p>
	 */
	private Date createdAt;

	/**
	 * <h2>updatedAt</h2>
	 * <p>
	 * updatedAt
	 * </p>
	 */
	private Date updatedAt;
	/**
	 * <h2>deletedAt</h2>
	 * <p>
	 * deletedAt
	 * </p>
	 */
	private Date deletedAt;
	/**
	 * <h2>getId</h2>
	 * <p>
	 * Getter for id
	 * </p>
	 *
	 * @return int
	 */
	public int getId() {
		return id;
	}
	/**
	 * <h2>setId</h2>
	 * <p>
	 * Setter for id
	 * </p>
	 *
	 * @param id int
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * <h2>getRollNumber</h2>
	 * <p>
	 * Getter for rollNumber
	 * </p>
	 *
	 * @return String
	 */
	public String getRollNumber() {
		return rollNumber;
	}
	/**
	 * <h2>setRollNumber</h2>
	 * <p>
	 * Setter for rollNumber
	 * </p>
	 *
	 * @param rollNumber String
	 */
	public void setRollNumber(String rollNumber) {
		this.rollNumber = rollNumber;
	}
	/**
	 * <h2>getName</h2>
	 * <p>
	 * Getter for name
	 * </p>
	 *
	 * @return String
	 */
	public String getName() {
		return name;
	}
	/**
	 * <h2>setName</h2>
	 * <p>
	 * Setter for name
	 * </p>
	 *
	 * @param name String
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * <h2>getMajor</h2>
	 * <p>
	 * Getter for major
	 * </p>
	 *
	 * @return String
	 */
	public String getMajor() {
		return major;
	}
	/**
	 * <h2>setMajor</h2>
	 * <p>
	 * 
	 * </p>
	 *
	 * @param major String
	 */
	public void setMajor(String major) {
		this.major = major;
	}
	/**
	 * <h2>getYear</h2>
	 * <p>
	 * Getter for year
	 * </p>
	 *
	 * @return String
	 */
	public String getYear() {
		return year;
	}
	/**
	 * <h2>setYear</h2>
	 * <p>
	 * Setter for year
	 * </p>
	 *
	 * @param year String
	 */
	public void setYear(String year) {
		this.year = year;
	}
	/**
	 * <h2>getEmail</h2>
	 * <p>
	 * Getter for email
	 * </p>
	 *
	 * @return String
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * <h2>setEmail</h2>
	 * <p>
	 * Setter for email
	 * </p>
	 *
	 * @param email String
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * <h2>getDob</h2>
	 * <p>
	 * Getter for dob
	 * </p>
	 *
	 * @return Date
	 */
	public String getDob() {
		return dob;
	}
	/**
	 * <h2>setDob</h2>
	 * <p>
	 * Setter for dob
	 * </p>
	 *
	 * @param dob String
	 */
	public void setDob(String dob) {
		this.dob = dob;
	}
	/**
	 * <h2>getCreatedAt</h2>
	 * <p>
	 * Getter Method for created_at of Student
	 * </p>
	 *
	 * @return Date
	 */
	public Date getCreatedAt() {
		return createdAt;
	}
	/**
	 * <h2>setCreatedAt</h2>
	 * <p>
	 * Setter Method for created_at of Student
	 * </p>
	 *
	 * @param createdAt Date
	 */
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	/**
	 * <h2>getUpdatedAt</h2>
	 * <p>
	 * Getter Method for updated_at of Student
	 * </p>
	 *
	 * @return Date
	 */
	public Date getUpdatedAt() {
		return updatedAt;
	}
	/**
	 * <h2>setUpdatedAt</h2>
	 * <p>
	 * Setter Method for updated_at of Student
	 * </p>
	 *
	 * @param updatedAt Date
	 */
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	/**
	 * <h2>getDeletedAt</h2>
	 * <p>
	 * Getter Method for deleted_at of Student
	 * </p>
	 *
	 * @return Date
	 */
	public Date getDeletedAt() {
		return deletedAt;
	}
	/**
	 * <h2>setDeletedAt</h2>
	 * <p>
	 * Setter Method for deleted_at of Student
	 * </p>
	 *
	 * @param deletedAt Date
	 */
	public void setDeletedAt(Date deletedAt) {
		this.deletedAt = deletedAt;
	}
	/**
	 * <h2>Constructor for StudentDTO</h2>
	 * <p>
	 * Constructor for StudentDTO
	 * </p>
	 */
	public StudentDTO() {
		super();
	}
	/**
	 * <h2>Constructor for StudentDTO</h2>
	 * <p>
	 * Constructor for StudentDTO
	 * </p>
	 * 
	 * @param student Student
	 */
	public StudentDTO(Student student) {
		super();
		this.id = student.getId();
		this.rollNumber = student.getRollNumber();
		this.name = student.getName();
		this.major = student.getMajor();
		this.year = String.valueOf(student.getYear());
		this.email = student.getEmail();
		this.dob = student.getDob();
		this.createdAt = student.getCreatedAt();
		this.updatedAt = student.getUpdatedAt();
	}
}
