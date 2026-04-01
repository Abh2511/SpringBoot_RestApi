package com.abhirat.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abhirat.binding.Course;


@Repository
public interface CourseRepository extends JpaRepository<Course,Integer>
{

}
