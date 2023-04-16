package com.cydeo.repository;

import com.cydeo.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Long> {

    //FIND ALL COURSES BY CATEGORY
    List<Course> findByCategory(String category);

    // {Boolean} Check if course with (X) name exists
    boolean existsByName(String name);


    @Query("SELECT c FROM Course c WHERE c.rating = ?1")
    List<Course> retrieveCourseByRating(int rating);

    // |] -> Both these methods are the same :: (first) -> JPQL Param  || (second) -> Custom Param
    List<Course> findByRating();


}
