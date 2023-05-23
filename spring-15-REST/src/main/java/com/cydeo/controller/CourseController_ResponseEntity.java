package com.cydeo.controller;

import com.cydeo.dto.CourseDTO;
import com.cydeo.service.CourseService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courses/api/v2")
public class CourseController_ResponseEntity {


    private final CourseService courseService;


    public CourseController_ResponseEntity(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping
    public ResponseEntity<List<CourseDTO>> getAllCourses(){

        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .header("V2", "Response Entity")
                .body(courseService.getCourses());

    }

    @GetMapping("{id}")
    public ResponseEntity<CourseDTO> getCourseViaID(@PathVariable("id") Long id){

        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .header("Te Qifsha Nenen", "Waaaa")
                .body(courseService.getCourseById(id));

    }

    @GetMapping("category/{catName}")
    public ResponseEntity<List<CourseDTO>> listAllCoursesViaCategory(@PathVariable("catName") String cat){

        return ResponseEntity.ok(courseService.getCoursesByCategory(cat)); // most basic way of returning REST
                                                                          // (w/ ResponseEntity)

    }

    @PostMapping
    public ResponseEntity<CourseDTO> createNewCourse(@RequestBody CourseDTO courseDTO){

//        return ResponseEntity.ok(courseService.createCourse(courseDTO));

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .header("Created", "Course Has Been Created")
                .body(courseService.createCourse(courseDTO));
    }

}
