package com.microservice.course.client;

import com.microservice.course.dto.StudentDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

//Nombre del microservice a conectarse, puerto y endPont del controlador
@FeignClient(name = "msvc-student", url = "localhost:8090/api/student")
public interface StudentClient { //Modificacion del cliente

    @GetMapping("/search-by-course/{idCourse}")
    List<StudentDTO> findAllStudentByCourse(@PathVariable("idCourse") Long idCourse); //Con esto le decimos que consumira este endPoint del controladr

}
