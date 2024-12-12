package com.example.course_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.course_management.model.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
