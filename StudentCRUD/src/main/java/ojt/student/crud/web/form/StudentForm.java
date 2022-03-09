package ojt.student.crud.web.form;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import org.springframework.format.annotation.DateTimeFormat;

import ojt.student.crud.persistence.entity.Student;
/**
 * <h2> StudentForm Class</h2>
 * <p>
 * Process for Displaying StudentForm
 * </p>
 * 
 * @author NweNi
 *
 */
public class StudentForm {
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
	@NotEmpty
	private String rollNumber;
	/**
	 * <h2>name</h2>
	 * <p>
	 * name
	 * </p>
	 */
	@NotEmpty
	private String name;
	/**
	 * <h2>major</h2>
	 * <p>
	 * major
	 * </p>
	 */
	@NotEmpty
	private String major;
	/**
	 * <h2>year</h2>
	 * <p>
	 * year
	 * </p>
	 */
	@NotEmpty
	private String year;
	/**
	 * <h2>email</h2>
	 * <p>
	 * email
	 * </p>
	 */
	@Email
	@NotEmpty
	private String email;
	/**
	 * <h2>dob</h2>
	 * <p>
	 * dob
	 * </p>
	 */
	@DateTimeFormat(pattern = "yyyy-mm-dd")
	private String dob;
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
	 * <h2>Constructor for StudentForm</h2>
	 * <p>
	 * Constructor for StudentForm
	 * </p>
	 */
	public StudentForm() {
		super();
	}
	public StudentForm(Student student) {
		super();
		this.id = student.getId();
		this.name = student.getName();
		this.major = student.getMajor();
		this.email = student.getEmail();
		this.dob = student.getDob();
	}
}
