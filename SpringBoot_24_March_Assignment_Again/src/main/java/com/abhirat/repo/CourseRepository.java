package com.abhirat.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abhirat.binding.Course;

public interface CourseRepository extends JpaRepository<Course,Integer>
{

}
