package com.abhirat;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.abhirat.entity.Student;
import com.abhirat.service.StudentService;

@RestController
public class StudentController 
{
	
	private StudentService service;
	
	@PostMapping
	public Student createStudent(@RequestBody Student student)
	{
		return service.saveStudent(student);
		
	}
	
	@GetMapping
	public List<Student> getAllStudents()
	{
		return service.getAllStudents();
	}
	
	@GetMapping("/{id}")
	public Student getStudentById(@PathVariable Integer id , @RequestBody Student student){
		return service.getStudentById(id);	
	}
	
	@PutMapping("/{id}")
	public Student updateStudent(@PathVariable Integer id, @RequestBody Student student)
	{
		student.setId(id);
		return service.saveStudent(student);
	}
	
	@DeleteMapping("/{id}")
	public String deleteStudent(@PathVariable Integer id)
	{
		service.deleteStudent(id);
		return "Delete Successfully";
	}
	
		
}
