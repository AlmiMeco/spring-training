package com.cydeo.bootstrap;

import com.cydeo.entity.Car;
import com.cydeo.entity.Department;
import com.cydeo.repository.CarRepository;
import com.cydeo.repository.DepartmentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataGenerator implements CommandLineRunner {

    private final CarRepository carRepository;
    private final DepartmentRepository departmentRepository;

    public DataGenerator(CarRepository carRepository, DepartmentRepository departmentRepository) {
        this.carRepository = carRepository;
        this.departmentRepository = departmentRepository;
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


    }




}
