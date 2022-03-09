package ojt.student.crud.bl.service.student;

import java.util.List;

import ojt.student.crud.bl.dto.StudentDTO;
import ojt.student.crud.web.form.StudentForm;
/**
 * <h2> StudentService Class</h2>
 * <p>
 * Process for Displaying StudentService
 * </p>
 * 
 * @author NweNi
 *
 */
public interface StudentService {
    /**
     * <h2>doAddStudent</h2>
     * <p>
     * Adding new Student
     * </p>
     *
     * @param studentForm StudentForm
     */
    public void doAddStudent(StudentForm studentForm);
    /**
     * <h2>doGetStudentList</h2>
     * <p>
     * Get student List
     * </p>
     *
     * @return List<StudentDTO>
     */
    public List<StudentDTO> doGetStudentList();
    /**
     * <h2>doGetStudentById</h2>
     * <p>
     * Get student by id
     * </p>
     *
     * @param id Integer
     * @return StudentForm
     */
    public StudentDTO doGetStudentById(Integer studentId);
    /**
     * <h2>doCheckRollNoExist</h2>
     * <p>
     * Check roll number exist or not
     * </p>
     *
     * @param rollNumber String
     * @return boolean
     */
    public boolean doCheckRollNoExist(String rollNumber);
    /**
     * <h2>doEditStudent</h2>
     * <p>
     * Edit student
     * </p>
     * 
     * @param studentForm StudentForm
     */
    public void doEditStudent(StudentForm studentForm);
    /**
     * <h2>doDeleteStudent</h2>
     * <p>
     * Deleting a Student
     * </p>
     *
     * @param studentId Integer
     */
    public void doDeleteStudent(Integer studentId);
}
