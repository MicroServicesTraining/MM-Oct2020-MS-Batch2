/**
 * 
 */
package com.mm.sb.demo.dao;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mm.sb.demo.mockdb.StudentMockDB;
import com.mm.sb.demo.models.Student;

/**
 * @author dorak
 *
 */
@Component
public class StudentDAO {

	@Autowired
	private StudentMockDB studentsDB;

	public List<Student> findAll() {
		return studentsDB.getStudentsList();
	}

	public Student saveStudent(Student student) {
		studentsDB.getStudentsList().add(student);
		return student;
	}

	public Student updateStudent(Student student) {
		Iterator<Student> it = studentsDB.getStudentsList().iterator();
		Student st = null;
		while(it.hasNext()) {
			st = it.next();
			if(student.getRollNo() == st.getRollNo()) {
				it.remove();
				studentsDB.getStudentsList().add(student);
			}
		}
		return student;
	}

}
