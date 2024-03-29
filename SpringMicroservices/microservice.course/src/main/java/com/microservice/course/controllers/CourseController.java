package com.microservice.course.controllers;

import com.microservice.course.entity.Course;
import com.microservice.course.services.ICourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/course")
public class CourseController {

    @Autowired
    private ICourseService courseService;

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveStudent(@RequestBody Course course) {
        courseService.save(course);
    }

    @GetMapping("/all")
    public ResponseEntity<?> findByAllStudent() {
        return ResponseEntity.ok(courseService.findAll());
    }

    @GetMapping("/search/{id}")
    public ResponseEntity<?> findById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(courseService.findById(id));
    }

    //endPoint que sera util para accerder a la respuesta personalizada
    @GetMapping("/search-student/{idCourse}")
    public ResponseEntity<?> findStudentsByIdCourse(@PathVariable("idCourse") Long idCourse) {
        return ResponseEntity.ok(courseService.findStudentsByIdCourse(idCourse));
    }

}
