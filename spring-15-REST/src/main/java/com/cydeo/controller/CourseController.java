package com.cydeo.controller;

import com.cydeo.dto.CourseDTO;
import com.cydeo.repository.CourseRepository;
import com.cydeo.service.CourseService;
import org.springframework.web.bind.annotation.*;

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
    public CourseDTO getCourseViaID(@PathVariable("id") Long id){

        return courseService.getCourseById(id);

    }

    @GetMapping("category/{catName}")
    public List<CourseDTO> listAllCoursesViaCategory(@PathVariable("catName") String cat){

        return courseService.getCoursesByCategory(cat);

    }

    @PostMapping
    public CourseDTO createNewCourse(@RequestBody CourseDTO courseDTO){

        return courseService.createCourse(courseDTO);

    }

    @PutMapping("{id}")
    public void updateCourse(@PathVariable("id") Long id, @RequestBody CourseDTO courseDTO){

        courseService.updateCourse(id, courseDTO);

    }

    @DeleteMapping("{id}")
    public void deleteCourseViaID(@PathVariable("id") Long id){

        courseService.deleteCourseById(id);

    }


}
