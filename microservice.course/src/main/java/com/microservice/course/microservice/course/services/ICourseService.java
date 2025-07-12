package com.microservice.course.microservice.course.services;

import com.microservice.course.microservice.course.entities.Course;
import com.microservice.course.microservice.course.http.response.StudentByCourseResponse;

import java.util.List;

public interface ICourseService {

    List<Course> findAll();

    Course findById(Long id);

    void save(Course course);

    StudentByCourseResponse findStudentByCourse(Long idCourse);
}
