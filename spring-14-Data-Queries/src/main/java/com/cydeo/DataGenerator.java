package com.cydeo;

import com.cydeo.repository.CourseRepository;
import com.cydeo.repository.DepartmentRepository;
import com.cydeo.repository.EmployeeRepository;
import com.cydeo.repository.RegionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Controller;

@Controller
public class DataGenerator implements CommandLineRunner {

    private final RegionRepository regionRepository;
    private final DepartmentRepository departmentRepository;
    private final EmployeeRepository employeeRepository;
    private final CourseRepository courseRepository;

    public DataGenerator(RegionRepository regionRepository, DepartmentRepository departmentRepository, EmployeeRepository employeeRepository, CourseRepository courseRepository) {
        this.regionRepository = regionRepository;
        this.departmentRepository = departmentRepository;
        this.employeeRepository = employeeRepository;
        this.courseRepository = courseRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("----REGIONS----");

        // Create Derived Query to Display All Regions in CANADA
        System.out.println("findByCountry (CANADA) : " + regionRepository.findByCountry("Canada"));
        System.out.println("findByCountry (United States) : " + regionRepository.findByCountry("United States"));
//----------------------------------------------------------------------------------------------------------------------
        //Display ALL regions with Country Name including "United"
        System.out.println("findByCountryContaining (United States) : " + regionRepository.findByCountryContaining("United"));
//----------------------------------------------------------------------------------------------------------------------
        //Display Top 2 regions in United States
        System.out.println("findTop2ByCountry (United States) : " + regionRepository.findTop2ByCountry("United States"));

//----------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------


        //Display ALL departments in the Furniture Dept
        System.out.println("findByDept (Furniture): " + departmentRepository.findByDepartment("Furniture"));
//----------------------------------------------------------------------------------------------------------------------

        //Display ALL departments in the Electronics division
        System.out.println("findByDivison (Electronics): " + departmentRepository.findByDivision("Electronics"));

        //Display Top 3 dept w/ div name including 'Hea' w.out dups
        System.out.println("findDistinctTop3ByDivisionContains ('Hea'): " + departmentRepository.findDistinctTop3ByDivisionContains("Hea"));

//----------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------
        System.out.println("----EMPLOYEES----");

        // Display ALL empl with null email adress
        System.out.println("findByEmail (...): " + employeeRepository.findByEmail(""));

        //Display ALL empl w/ Salary below ""
//        System.out.println("findBySalaryLessThan (50,000): " + employeeRepository.findBySalaryLessThan(50000));

        System.out.println("findByEmail (null): " + employeeRepository.findByEmailIsNull());

        System.out.println("findBySalary (56688): " + employeeRepository.findBySalary(56688));

        System.out.println("retrieveEmpSalary (via customQuery) -> " + employeeRepository.retrieveEmpSalary());

//----------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------
        System.out.println("----COURSES----");

        //FIND ALL COURSES BY CATEGORY
        System.out.println("findByCategory (category) -> " + courseRepository.findByCategory("Spring"));





    }
}
