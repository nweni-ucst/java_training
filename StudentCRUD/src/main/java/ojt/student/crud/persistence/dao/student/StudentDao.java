package ojt.student.crud.persistence.dao.student;

import java.util.List;

import ojt.student.crud.persistence.entity.Student;
/**
 * <h2>StudentDao Class</h2>
 * <p>
 * Process for Displaying StudentDao
 * </p>
 * 
 * @author NweNi
 *
 */
public interface StudentDao {
	/**
	 * <h2>dbAddStudent</h2>
	 * <p>
	 * Adding new Student
	 * </p>
	 *
	 * @param student Student
	 */
	public void dbAddStudent(Student student);
	/**
	 * <h2>dbGetStudentList</h2>
	 * <p>
	 * Getting all students
	 * </p>
	 *
	 * @return List<Student>
	 */
	public List<Student> dbGetStudentList();
	/**
	 * <h2>dbGetStudentById</h2>
	 * <p>
	 * Get student by id
	 * </p>
	 *
	 * @param studentId Integer
	 * @return Student
	 */
	public Student dbGetStudentById(Integer studentId);
	/**
	 * <h2>dbGetStudentByRollNumber</h2>
	 * <p>
	 * Get student by roll number
	 * </p>
	 *
	 * @param rollNumber String
	 * @return Student
	 */
	public Student dbGetStudentByRollNumber(String rollNumber);
	/**
	 * <h2>dbEditStudent</h2>
	 * <p>
	 * Edit student
	 * </p>
	 *
	 * @param student Student
	 */
	public void dbEditStudent(Student student);
}
