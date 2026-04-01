package com.abhirat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abhirat.entity.Student;
import com.abhirat.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository repository;
	
	public Student saveStudent(Student student)
	{
		return repository.save(student);
	}
	
	public List<Student> getAllStudents()
	{
		return repository.findAll();
	}
	public Student getStudentById(Integer id)
	{
		return repository.findById(id).orElse(null);
	}
	public void deleteStudent(Integer id)
	{
		repository.deleteById(id);
	}
}
