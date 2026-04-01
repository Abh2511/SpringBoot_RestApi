package com.abhirat.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abhirat.entity.Student;

public interface StudentRepository extends JpaRepository<Student,Integer>
{

}
