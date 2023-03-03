package com.cydeo.config;

import com.cydeo.casefactory.Case;
import com.cydeo.casefactory.CaseDimensions;
import com.cydeo.casefactory.DellCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanWiring {


    @Bean
    public CaseDimensions dimensions() {
        return new CaseDimensions(50, 10, 10);
    }

    @Bean
    public Case dellCase() {
        return new DellCase("WBV8-AZ", "DELL", "240v", dimensions());
//        dimensions() method called in dellCAse() method [Bean Wiring]
    }

}
