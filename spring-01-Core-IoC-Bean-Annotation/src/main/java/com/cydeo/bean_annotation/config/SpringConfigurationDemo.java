package com.cydeo.bean_annotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/**Container called under 'SpringContainer' (Line : 17)**/
@Configuration // <-- annotation notating these methods (Beans) will be implemented in obj creation
public class SpringConfigurationDemo {

    @Bean // <-- annotation notating that this method (along w/ implementation) is to be used to creat obj.
    public String begining(){
        return "Hello WOrld";
    }

    @Bean
    public Integer diceRoll(){
        return 3; // <-- implementation
    }



}
