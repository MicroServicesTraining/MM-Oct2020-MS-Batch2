/**
 * 
 */
package com.mm.sb.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mm.sb.demo.dao.StudentDAO;
import com.mm.sb.demo.models.Student;
import com.mm.sb.demo.responses.StudentsResponse;

/**
 * @author dorak
 *
 */
@Component
public class StudentService {

	@Autowired
	private StudentDAO studentDAO;

	public List<Student> getAllStudents() {
		//StudentDAO studentDAO = new StudentDAO();
		return studentDAO.findAll();
	}

	public StudentsResponse createNewStudent(Student student) {
		StudentsResponse sr = new StudentsResponse();
		try {
		if(student.getMarks() > 100) {
			throw new Exception("Invalid Student Marks");
		}
		
		}catch(Exception e) {
			sr.setStatus(500);
			sr.setMessage(e.getMessage());
			return sr;
		}
		Student st = studentDAO.saveStudent(student);
		sr.setStatus(200);
		sr.setMessage("Saving student successful");
		sr.setStudent(st);
		return sr;
	}

	public Student updateStudent(Student student) throws Exception {
		if(student.getMarks() > 100) {
			throw new Exception("Invalid Student Marks");
		}
		return studentDAO.updateStudent(student);
	}

	public StudentsResponse getStudentByRollNo(Long rollno) {
		Student st = null;
		StudentsResponse sr = new StudentsResponse();
		System.out.println("StudentService : getStudentByRollNo : " + rollno);
		for(Student student : studentDAO.findAll()) {
			System.out.println("StudentService : inside for : " + rollno);
			if(student.getRollNo().equals(rollno)) {
				System.out.println("StudentService : inside if - found matching student record for rollno - " + rollno);
				st = student;
				break;
			}
		}			
		if(st == null) {
			sr.setStatus(404);
			sr.setMessage("No student found with roll number " + rollno);
		} else {
			sr.setStatus(200);
			sr.setMessage("Student found with roll number " + rollno);
			sr.setStudent(st);
		}
		return sr;
	}

}
