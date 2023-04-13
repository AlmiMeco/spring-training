package com.cydeo;

import com.cydeo.repository.RegionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Controller;

@Controller
public class DataGenerator implements CommandLineRunner {

    private final RegionRepository regionRepository;

    public DataGenerator(RegionRepository regionRepository) {
        this.regionRepository = regionRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("findByCountry (CANADA) : " + regionRepository.findByCountry("Canada"));
        System.out.println("findByCountry (United States) : " + regionRepository.findByCountry("United States"));
        //------------------------------------------------------------------------------------------------------
        System.out.println("findByCountryContaining (United States) : " + regionRepository.findByCountryContaining("United"));


    }
}
