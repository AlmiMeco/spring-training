package com.cydeo.repository;

import com.cydeo.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DepartmentRepository extends JpaRepository<Department, String> {


    //Display ALL departments in the Furniture Dept
    List<Department> findByDepartment(String dept);

    //Display ALL departments in the Electronics division
    List<Department> findByDivision(String div);

    //Display Top 3 dept w/ div name including 'Hea' w.out dups
    List<Department> findDistinctTop3ByDivisionContains(String pattern);


}
