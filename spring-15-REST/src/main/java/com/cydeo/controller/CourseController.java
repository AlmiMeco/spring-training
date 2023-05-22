package com.cydeo.controller;

import com.cydeo.dto.CourseDTO;
import com.cydeo.repository.CourseRepository;
import com.cydeo.service.CourseService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController // << REST Controller (signifies that this is a REST controller ... NO VIEW RETURNED)
@RequestMapping("/courses")
public class CourseController {


    private final CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }


    @GetMapping
    public List<CourseDTO> listALlCourses(){

        return courseService.getCourses(); // << returns API (REST -> Piece of a Service)

          /* NO HTML return needed (NO VIEW) */
    }

    @GetMapping("{id}")
    public CourseDTO getCourseViaID(Long id){

        return courseService.getCourseById(id);

    }


}
