/**
 * 
 */
package com.mm.sb.client.ms.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.mm.sb.client.ms.domain.Student;
import com.mm.sb.client.ms.responses.StudentsResponse;

/**
 * @author dorak
 *
 */
@RestController
@RequestMapping("/api/client")
public class StudentsServiceClient {

	@GetMapping("hello")
	public String sayHello() {
		return "<h1>Hello Student Service Client</h1>";
	}

	@GetMapping("allstudents")
	public List<Student> getAllStudents() {
		RestTemplate restTemplate = new RestTemplate();
		return (List<Student>) restTemplate.getForObject("http://localhost:8090/school/students/all", List.class);
	}

	@GetMapping("byname/{name}")
	public StudentsResponse getStudnetByName(@PathVariable("name") String studentName) {
		RestTemplate restTemplate = new RestTemplate();
		StudentsResponse st = null;
		ResponseEntity<StudentsResponse> response = restTemplate
				.getForEntity("http://localhost:8090/school/students/find/byname?name=" + studentName, StudentsResponse.class);
		if (response.hasBody()) {
			st = response.getBody();
		} else {
			st = new StudentsResponse();
		}

		return st;
	}
}
