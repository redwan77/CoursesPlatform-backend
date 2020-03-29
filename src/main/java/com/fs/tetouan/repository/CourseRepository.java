package com.fs.tetouan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fs.tetouan.model.Course;

public interface CourseRepository  extends JpaRepository<Course, Long> {

}
