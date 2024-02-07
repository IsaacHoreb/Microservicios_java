package com.microservice.course.services;

import com.microservice.course.entity.Course;
import com.microservice.course.http.response.StudentByCourseResponse;

import java.util.List;

public interface ICourseService {

    List<Course> findAll();

    Course findById(Long id);

    void save(Course course);

    //Se agrega despues de crear el http personalizado[response]
    StudentByCourseResponse findStudentsByIdCourse(Long idCourse);

}
