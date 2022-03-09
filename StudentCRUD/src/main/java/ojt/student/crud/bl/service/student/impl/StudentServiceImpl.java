package ojt.student.crud.bl.service.student.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ojt.student.crud.bl.dto.StudentDTO;
import ojt.student.crud.bl.service.student.StudentService;
import ojt.student.crud.persistence.dao.student.StudentDao;
import ojt.student.crud.persistence.entity.Student;
import ojt.student.crud.web.form.StudentForm;
/**
 * <h2> StudentServiceImpl Class</h2>
 * <p>
 * Process for Displaying StudentServiceImpl
 * </p>
 * 
 * @author NweNi
 *
 */
@Transactional
@Service
public class StudentServiceImpl implements StudentService {
    /**
     * <h2>studentDao</h2>
     * <p>
     * Student Dao
     * </p>
     */
    @Autowired
    private StudentDao studentDao;
    /**
     * <h2>doAddStudent</h2>
     * <p>
     * Adding new Student
     * </p>
     * 
     * @param studentForm StudentForm
     */
    @Override
    public void doAddStudent(StudentForm studentForm) {
        Student student = new Student(studentForm);
        student.setCreatedAt(new Date());
        student.setUpdatedAt(new Date());
        this.studentDao.dbAddStudent(student);
    }
    /**
     * <h2>doGetStudentList</h2>
     * <p>
     * Getting all Students
     * </p>
     *
     * @return List<StudentDTO>
     */
    @Override
    public List<StudentDTO> doGetStudentList() {
        List<StudentDTO> studentList = new ArrayList<StudentDTO>();
        for (Student student : this.studentDao.dbGetStudentList()) {
            StudentDTO studentDto = new StudentDTO(student);
            studentList.add(studentDto);
        }
        return studentList;
    }
    /**
     * <h2>doGetStudentById</h2>
     * <p>
     * Get student by id
     * </p>
     * 
     * @param studentID Integer
     * @return StudentDTO
     */
    @Override
    public StudentDTO doGetStudentById(Integer studentId) {
        Student student = this.studentDao.dbGetStudentById(studentId);
        StudentDTO studentForm = student != null ? new StudentDTO(student) : null;
        return studentForm;
    }
    /**
     * <h2>doCheckRollNoExist</h2>
     * <p>
     * Check roll number exist or not
     * </p>
     *
     * @param rollNumber String
     * @return boolean
     */
    @Override
    public boolean doCheckRollNoExist(String rollNumber) {
        Student student = this.studentDao.dbGetStudentByRollNumber(rollNumber);
        if (student != null) {
            return true;
        }
        return false;
    }
    /**
     * <h2>doEditStudent</h2>
     * <p>
     * Edit a student
     * </p>
     * 
     * @param studentForm StudentForm
     */
    @Override
    public void doEditStudent(StudentForm studentForm) {
        Student student = this.studentDao.dbGetStudentById(studentForm.getId());
        student.setRollNumber(studentForm.getRollNumber());
        student.setName(studentForm.getName());
        student.setMajor(studentForm.getMajor());
        student.setYear(Integer.parseInt(studentForm.getYear()));
        student.setEmail(studentForm.getEmail());
        student.setDob(studentForm.getDob());
        student.setUpdatedAt(new Date());
        this.studentDao.dbEditStudent(student);
    }
    /**
     * <h2>doDeleteStudent</h2>
     * <p>
     * Deleting a Student
     * </p>
     *
     * @param studentId Integer
     */
    @Override
    public void doDeleteStudent(Integer studentId) {
        Student student = this.studentDao.dbGetStudentById(studentId);
        student.setDeletedAt(new Date());
    }
}
