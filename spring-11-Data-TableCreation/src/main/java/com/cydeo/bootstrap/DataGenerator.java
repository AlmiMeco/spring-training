package com.cydeo.bootstrap;

import com.cydeo.entity.Car;
import com.cydeo.entity.Department;
import com.cydeo.entity.Employee;
import com.cydeo.repository.CarRepository;
import com.cydeo.repository.DepartmentRepository;
import com.cydeo.repository.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataGenerator implements CommandLineRunner {

    private final CarRepository carRepository;
    private final DepartmentRepository departmentRepository;
    private final EmployeeRepository employeeRepository;

    public DataGenerator(CarRepository carRepository, DepartmentRepository departmentRepository, EmployeeRepository employeeRepository) {
        this.carRepository = carRepository;
        this.departmentRepository = departmentRepository;
        this.employeeRepository = employeeRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Car car1 = new Car("Audi", "A6");
        Car car2 = new Car("BMW", "M6");
        Car car3 = new Car("Ford", "Focus RS");

        carRepository.save(car1);
        carRepository.save(car2);
        carRepository.save(car3);


        Department department1 = new Department("Furniture", "Luxury Goods");
        Department department2 = new Department("Laptops & Computers", "Electronics");
        Department department3 = new Department("Beverages", "Perishable Goods");

        departmentRepository.save(department1);
        departmentRepository.save(department2);
        departmentRepository.save(department3);


        Employee employee1 = new Employee("Almi", "Meco", "almi355@hotmail.com");
        Employee employee2 = new Employee("Alec", "Baldwin", "lolgetSniped@hotmail.com");
        Employee employee3 = new Employee("Jack", "BLach", "teehee@hotmail.com");

        employeeRepository.save(employee1);
        employeeRepository.save(employee2);
        employeeRepository.save(employee3);

    }




}
