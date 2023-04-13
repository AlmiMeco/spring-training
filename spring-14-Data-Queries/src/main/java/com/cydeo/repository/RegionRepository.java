package com.cydeo.repository;

import com.cydeo.entity.Region;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RegionRepository extends JpaRepository<Region, Long> {

    // Create Derived Query to Display All Regions in CANADA
    List<Region> findByCountry(String country);

    //Display ALL regions with Country Name including "United"
    List<Region> findByCountryContaining(String country);

    //Display ALL



}
