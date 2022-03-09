package ojt.student.crud.web.controller.student;

import java.text.ParseException;
import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ojt.student.crud.bl.dto.StudentDTO;
import ojt.student.crud.bl.service.student.StudentService;
import ojt.student.crud.web.form.StudentForm;
/**
 * <h2>StudentController Class</h2>
 * <p>
 * Process for Displaying StudentController
 * </p>
 * 
 * @author NweNi
 *
 */
@Controller
public class StudentController {
	/**
	 * <h2>Student Service</h2>
	 * <p>
	 * Student Service
	 * </p>
	 */
	@Autowired
	private StudentService studentService;
	/**
	 * <h2>Message Source</h2>
	 * <p>
	 * Message Source
	 * </p>
	 */
	@Autowired
	private MessageSource messageSource;
	/**
	 * <h2>initView</h2>
	 * <p>
	 * Initial mapping
	 * </p>
	 *
	 * @param model
	 * @return String
	 */
	@GetMapping(value = "/init")
	public ModelAndView initView(Model model) {
		return new ModelAndView("redirect:/students");
	}
	/**
	 * <h2>getCreateStudentView</h2>
	 * <p>
	 * Show create student view
	 * </p>
	 *
	 * @return ModelAndView
	 */
	@GetMapping(value = "/registerStudent")
	public ModelAndView getCreateStudentView() {
		ModelAndView createStudentView = new ModelAndView("createStudent");
		createStudentView.addObject("rollBackStudentForm", new StudentForm());
		return createStudentView;
	}
	/**
	 * <h2>confirmStudentCreation</h2>
	 * <p>
	 * Show confirm page for student creation
	 * </p>
	 *
	 * @param studentForm StudentForm
	 * @param result      BindingResult
	 * @throws ParseException
	 * @return ModelAndView
	 */
	@PostMapping(value = "/confirmRegisterStudent", params = "confirmStudent")
	public ModelAndView confirmStudentCreation(@ModelAttribute("rollBackStudentForm") @Valid StudentForm studentForm,
			BindingResult result) throws ParseException {
		ModelAndView createConfirmView = new ModelAndView("createStudent");
		if (result.hasErrors()) {
			createConfirmView.addObject("rollBackStudentForm", studentForm);
			createConfirmView.addObject("errorMsg", this.messageSource.getMessage("M_SC_0007", null, null));
			return createConfirmView;
		}
		if (this.studentService.doCheckRollNoExist(studentForm.getRollNumber())) {
			createConfirmView.addObject("rollBackStudentForm", studentForm);
			createConfirmView.addObject("errorMsg", this.messageSource.getMessage("M_SC_0018", null, null));
			return createConfirmView;
		}
		createConfirmView.addObject("studentForm", studentForm);
		createConfirmView.setViewName("createStudentConfirm");
		return createConfirmView;
	}
	/**
	 * <h2>createStudent</h2>
	 * <p>
	 * Create a new student
	 * </p>
	 *
	 * @param studentForm StudentForm
	 * @param session     HttpSession
	 * @return ModelAndView
	 */
	@PostMapping(value = "/registerStudent", params = "addStudent")
	public ModelAndView createStudent(@ModelAttribute("studentForm") @Valid StudentForm studentForm,
			HttpSession session) {
		this.studentService.doAddStudent(studentForm);
		session.setAttribute("successMsg", this.messageSource.getMessage("M_SC_0019", null, null));
		return new ModelAndView("redirect:/students");
	}
	/**
	 * <h2>cancelCreation</h2>
	 * <p>
	 * Cancel for student creation
	 * </p>
	 *
	 * @param studentForm StudentForm
	 * @return ModelAndView
	 */
	@PostMapping(value = "/registerStudent", params = "cancel")
	public ModelAndView cancelCreation(@ModelAttribute("studentForm") @Valid StudentForm studentForm)
			throws ParseException {
		ModelAndView createStudentView = new ModelAndView("createStudent");
		createStudentView.addObject("rollBackStudentForm", studentForm);
		return createStudentView;
	}
	/**
	 * <h2>getStudentList</h2>
	 * <p>
	 * Getting list of all Students
	 * </p>
	 *
	 * @return ModelAndView
	 */
	@GetMapping(value = "/students")
	public ModelAndView getStudentList() {
		ModelAndView studentListView = new ModelAndView("studentList");
		List<StudentDTO> StudentList = this.studentService.doGetStudentList();
		studentListView.addObject("StudentList", StudentList);
		return studentListView;
	}
	/**
	 * <h2>getEditStudentView</h2>
	 * <p>
	 * Show edition student view
	 * </p>
	 *
	 * @param studentId Integer
	 * @return ModelAndView
	 */
	@GetMapping(value = "/editStudent")
	public ModelAndView getEditStudentView(@RequestParam("id") Integer studentId) {
		StudentDTO student = this.studentService.doGetStudentById(studentId);
		ModelAndView editStudentView = new ModelAndView("updateStudent");
		editStudentView.addObject("student", student);
		return editStudentView;
	}
	/**
	 * <h2>confirmStudentEdition</h2>
	 * <p>
	 * Show confirm student edition page
	 * </p>
	 * 
	 * @param updateStudentForm StudentForm
	 * @param result            BindingResult
	 * @return ModelAndView
	 */
	@PostMapping(value = "/confirmEditStudent")
	public ModelAndView confirmStudentEdition(@ModelAttribute("student") @Valid StudentForm updateStudentForm,
			BindingResult result) throws ParseException {
		ModelAndView updateConfirmView = new ModelAndView("updateStudent");
		if (result.hasErrors()) {
			updateConfirmView.addObject("updateStudentForm", updateStudentForm);
			updateConfirmView.addObject("errorMsg", messageSource.getMessage("M_SC_0008", null, null));
			return updateConfirmView;
		}
		if (this.studentService.doCheckRollNoExist(updateStudentForm.getRollNumber())) {
			updateConfirmView.addObject("updateStudentForm", updateStudentForm);
			updateConfirmView.addObject("errorMsg", messageSource.getMessage("M_SC_0018", null, null));
			return updateConfirmView;
		}
		updateConfirmView = new ModelAndView("updateStudentConfirm");
		updateConfirmView.addObject("updateStudentForm", updateStudentForm);
		updateConfirmView.setViewName("updateStudentConfirm");
		return updateConfirmView;
	}
	/**
	 * <h2>updateStudent</h2>
	 * <p>
	 * Update student
	 * </p>
	 *
	 * @param studentForm StudentForm
	 * @param session     HttpSession
	 * @return ModelAndView
	 */
	@PostMapping(value = "/editStudent", params = "update")
	public ModelAndView updateStudent(@ModelAttribute("finalConfirmStudentForm") @Valid StudentForm studentForm,
			HttpSession session) {
		this.studentService.doEditStudent(studentForm);
		session.setAttribute("successMsg", this.messageSource.getMessage("M_SC_0021", null, null));
		return new ModelAndView("redirect:/students");
	}
	/**
	 * <h2>cancelUpdateStudent</h2>
	 * <p>
	 * Cancel Student Edition
	 * </p>
	 *
	 * @param studentForm StudentForm
	 * @throws ParseException
	 * @return ModelAndView
	 */
	@PostMapping(value = "/editStudent", params = "cancel")
	public ModelAndView cancelUpdateStudent(@ModelAttribute("finalConfirmStudentForm") @Valid StudentForm studentForm)
			throws ParseException {
		ModelAndView updateStudentView = new ModelAndView("updateStudent");
		updateStudentView.addObject("student", studentForm);
		return updateStudentView;
	}
	/**
	 * <h2>deleteStudent</h2>
	 * <p>
	 * Deleting a Student
	 * </p>
	 *
	 * @param studentId Integer
	 * @param session   HttpSession
	 * @return ModelAndView
	 */
	@GetMapping(value = "/deleteStudent")
	public ModelAndView deleteStudent(@RequestParam("id") Integer studentId, HttpSession session) {
		this.studentService.doDeleteStudent(studentId);
		session.setAttribute("successMsg", this.messageSource.getMessage("M_SC_0020", null, null));
		return new ModelAndView("redirect:/students");
	}
}
