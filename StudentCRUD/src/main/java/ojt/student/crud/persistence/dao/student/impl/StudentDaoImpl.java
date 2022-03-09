package ojt.student.crud.persistence.dao.student.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ojt.student.crud.persistence.dao.student.StudentDao;
import ojt.student.crud.persistence.entity.Student;
/**
 * <h2>StudentDaoImpl Class</h2>
 * <p>
 * Process for Displaying StudentDaoImpl
 * </p>
 * 
 * @author NweNi
 *
 */
@SuppressWarnings("deprecation")
@Repository
public class StudentDaoImpl implements StudentDao {
	/**
	 * <h2>SELECT_STUDENT_HQL</h2>
	 * <p>
	 * SELECT_STUDENT_HQL
	 * </p>
	 */
	private static final String SELECT_STUDENT_HQL = "SELECT " + "s " + "FROM " + "Student s " + "WHERE "
			+ "deletedAt IS NULL ";
	/**
	 * <h2>sessionFactory</h2>
	 * <p>
	 * sessionFactory
	 * </p>
	 */
	@Autowired
	private SessionFactory sessionFactory;
	/**
	 * <h2>dbAddStudent</h2>
	 * <p>
	 * Adding new Student
	 * </p>
	 *
	 * @param student Student
	 */
	@Override
	public void dbAddStudent(Student student) {
		this.sessionFactory.getCurrentSession().save(student);
	}
	/**
	 * <h2>getStudentList</h2>
	 * <p>
	 * Getting all students
	 * </p>
	 *
	 * @return List<Student>
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Student> dbGetStudentList() {
		return this.sessionFactory.getCurrentSession().createQuery(SELECT_STUDENT_HQL).list();
	}
	/**
	 * <h2>dbGetStudentById</h2>
	 * <p>
	 * Get student by id
	 * </p>
	 * 
	 * @param studentId Integer
	 * @return Student
	 */
	@SuppressWarnings({ "rawtypes" })
	@Override
	public Student dbGetStudentById(Integer studentId) {
		StringBuffer queryStr = new StringBuffer(SELECT_STUDENT_HQL);
		queryStr.append("AND s.id = :id");
		Query query = this.sessionFactory.getCurrentSession().createQuery(queryStr.toString());
		query.setParameter("id", studentId);
		return (Student) query.uniqueResult();
	}
	/**
	 * <h2>dbGetStudentByRollNumber</h2>
	 * <p>
	 * Get student by roll number
	 * </p>
	 *
	 * @param rollNumber String
	 * @return Student
	 */
	@SuppressWarnings({ "rawtypes" })
	@Override
	public Student dbGetStudentByRollNumber(String rollNumber) {
		StringBuffer queryStr = new StringBuffer(SELECT_STUDENT_HQL);
		queryStr.append("AND s.rollNumber = :rollNumber ");
		Query query = this.sessionFactory.getCurrentSession().createQuery(queryStr.toString());
		query.setParameter("rollNumber", rollNumber);
		return (Student) query.uniqueResult();
	}
	/**
	 * <h2>dbEditStudent</h2>
	 * <p>
	 * Edit student
	 * </p>
	 *
	 * @param student Student
	 */
	@Override
	public void dbEditStudent(Student student) {
		this.sessionFactory.getCurrentSession().update(student);
	}
}
