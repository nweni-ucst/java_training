package ojt.student.crud.persistence.entity;

import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import ojt.student.crud.web.form.StudentForm;
/**
 * <h2>Student Class</h2>
 * <p>
 * Process for Displaying Student
 * </p>
 * 
 * @author NweNi
 *
 */
@Entity
@Table(name = "student")
public class Student implements Serializable {
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
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id")
	private int id;
	/**
	 * <h2>rollNumber</h2>
	 * <p>
	 * rollNumber
	 * </p>
	 */
	@Column(name = "roll_number")
	private String rollNumber;
	/**
	 * <h2>name</h2>
	 * <p>
	 * name
	 * </p>
	 */
	@Column(name = "name")
	private String name;
	/**
	 * <h2>major</h2>
	 * <p>
	 * major
	 * </p>
	 */
	@Column(name = "major")
	private String major;
	/**
	 * <h2>year</h2>
	 * <p>
	 * year
	 * </p>
	 */
	@Column(name = "year")
	private int year;
	/**
	 * <h2>email</h2>
	 * <p>
	 * email
	 * </p>
	 */
	@Column(name = "email")
	private String email;
	/**
	 * <h2>dob</h2>
	 * <p>
	 * dob
	 * </p>
	 */
	@Column(name = "dob")
	private String dob;
	/**
	 * <h2>createdAt</h2>
	 * <p>
	 * createdAt
	 * </p>
	 */
	@Column(name = "created_at")
	private Date createdAt;
	/**
	 * <h2>updatedAt</h2>
	 * <p>
	 * updatedAt
	 * </p>
	 */
	@Column(name = "updated_at")
	private Date updatedAt;
	/**
	 * <h2>deletedAt</h2>
	 * <p>
	 * deletedAt
	 * </p>
	 */
	@Column(name = "deleted_at")
	private Date deletedAt;
	/**
	 * <h2>getId</h2>
	 * <p>
	 * Getter Method For Id of Student
	 * </p>
	 *
	 * @return id
	 */
	public int getId() {
		return id;
	}
	/**
	 * <h2>setId</h2>
	 * <p>
	 * Setter Method For Id of Student
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
	 * Getter Method For rollNumber of Student
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
	 * Setter Method For rollNumber of Student
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
	 * Getter Method for name of Student
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
	 * Setter Method for name of Student
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
	 * Getter Method for major of Student
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
	 * Setter Method for major of Student
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
	 * Getter Method for year of Student
	 * </p>
	 *
	 * @return int
	 */
	public int getYear() {
		return year;
	}
	/**
	 * <h2>setYear</h2>
	 * <p>
	 * Setter Method for year of Student
	 * </p>
	 *
	 * @param year int
	 */
	public void setYear(int year) {
		this.year = year;
	}
	/**
	 * <h2>getEmail</h2>
	 * <p>
	 * Getter Method for email of Student
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
	 * Setter Method for email of Student
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
	 * Getter Method for dob of Student
	 * </p>
	 *
	 * @return String
	 */
	public String getDob() {
		return dob;
	}
	/**
	 * <h2>setDob</h2>
	 * <p>
	 * Setter Method for dob of Student
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
	 * Getter Method for createdAt of Student
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
	 * Setter Method for updatedAt of Student
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
	 * Getter Method for deletedAt of Student
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
	 * Setter Method for deletedAt of Student
	 * </p>
	 *
	 * @param deletedAt
	 */
	public void setDeletedAt(Date deletedAt) {
		this.deletedAt = deletedAt;
	}
	/**
	 * <h2>Constructor for Student</h2>
	 * <p>
	 * Constructor for Student
	 * </p>
	 */
	public Student() {
		super();
	}
	/**
	 * <h2>Constructor for Student</h2>
	 * <p>
	 * Constructor for Student
	 * </p>
	 * 
	 * @param studentForm StudentForm
	 */
	public Student(StudentForm studentForm) {
		this.id = studentForm.getId();
		this.rollNumber = studentForm.getRollNumber();
		this.name = studentForm.getName();
		this.major = studentForm.getMajor();
		this.year = Integer.parseInt(studentForm.getYear());
		this.email = studentForm.getEmail();
		this.dob = studentForm.getDob();
	}
}
