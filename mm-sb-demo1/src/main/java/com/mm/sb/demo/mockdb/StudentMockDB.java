/**
 * 
 */
package com.mm.sb.demo.mockdb;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.mm.sb.demo.models.Student;

/**
 * @author dorak
 *
 */
@Component
public class StudentMockDB {
	List<Student> studentsList;

	/**
	 * @param students
	 */
	public StudentMockDB() {
		studentsList = new ArrayList<Student>();
		Student student1 = new Student(1001l, "Pankaj", 89);
		Student student2 = new Student(1002l, "Pavan", 76);
		studentsList.add(student1);
		studentsList.add(student2);
	}

	/**
	 * @return the studentsList
	 */
	public List<Student> getStudentsList() {
		return studentsList;
	}

	/**
	 * @param studentsList the studentsList to set
	 */
	public void setStudentsList(List<Student> studentsList) {
		this.studentsList = studentsList;
	}

	
	
}
