/**
 * 
 */
package com.mm.sb.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mm.sb.demo.models.Student;
import com.mm.sb.demo.responses.StudentsResponse;
import com.mm.sb.demo.services.StudentService;

/**
 * @author dorak
 *
 */
@RestController
@RequestMapping("/students")
public class StudentsController {
	
	@Autowired
	private StudentService studentService;
	
	// - /students/all
	@RequestMapping(path="/all", method=RequestMethod.GET)
	public List<Student> getAllStudents(){	
		return studentService.getAllStudents();
	}
	
	
	@GetMapping(path="/{rollno}")
	public StudentsResponse getStudentByRollNo(@PathVariable("rollno") Long rollno){	
		System.out.println("StudentsController : getStudentByRollNo : " + rollno);
		return studentService.getStudentByRollNo(rollno);
	}
	
	
	@PostMapping(path="/new")
	public StudentsResponse createStudent(@RequestBody Student student) throws Exception {
		return studentService.createNewStudent(student);
	}
	
	@PutMapping(path="/update")
	public Student updateStudent(@RequestBody Student student) throws Exception {
		return studentService.updateStudent(student);
	}
	
	//localhost:8090/school/students/find?name=pavan
	@GetMapping("find/byname")
	public StudentsResponse findByName(@RequestParam("name") String studentname) {
		return studentService.findByName(studentname);
	}
	
}
