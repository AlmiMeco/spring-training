package com.cydeo.controller;

import com.cydeo.dto.CourseDTO;
import com.cydeo.dto.ResponseWrapper;
import com.cydeo.service.CourseService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/courses/api/v3")
public class CourseController_ResponseWrapper {


    private final CourseService courseService;

    public CourseController_ResponseWrapper(CourseService courseService) {
        this.courseService = courseService;
    }


    @GetMapping
    public ResponseEntity<ResponseWrapper> getAllCourses(){

        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .header("V3", "Response Entity")
                .body(new ResponseWrapper("Courses Successfully Retrieved", courseService.getCourses()));

    }

    @GetMapping("{id}")
    public ResponseEntity<ResponseWrapper> getCourseViaID(@PathVariable("id") Long id){

        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .header("Te Qifsha Nenen", "Waaaa")
                .body(new ResponseWrapper("Retrieved Course by ID # -> " + id, courseService.getCourseById(id)));

    }



}
