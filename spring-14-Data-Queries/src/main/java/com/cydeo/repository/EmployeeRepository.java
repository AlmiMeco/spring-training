package com.cydeo.repository;

import com.cydeo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import javax.persistence.Id;
import javax.transaction.Transactional;
import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    // Display ALL empl with null email adress
    List<Employee> findByEmail(String email);
    List<Employee> findByEmailIsNull();

    //Display ALL empl w/ Salary below ""
    List<Employee> findBySalaryLessThan(Integer salary);



    List<Employee> findBySalary(Integer salary);





                                            /* |CUSTOM QUERY| */
    @Query("SELECT e.salary FROM Employee e WHERE e.firstName='Bernardine'")
    Integer retrieveEmpSalary();





}
