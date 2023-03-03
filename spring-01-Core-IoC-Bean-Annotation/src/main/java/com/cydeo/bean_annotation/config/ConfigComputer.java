package com.cydeo.bean_annotation.config;

import com.cydeo.bean_annotation.casefactory.Case;
import com.cydeo.bean_annotation.casefactory.DellCase;
import com.cydeo.bean_annotation.monitorfactory.Monitor;
import com.cydeo.bean_annotation.monitorfactory.SonyMonitor;
import com.cydeo.bean_annotation.motherboardfactory.AsusMotherboard;
import com.cydeo.bean_annotation.motherboardfactory.Motherboard;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @CONFIGURATION CLASS WITH BEAN (OBJECTS) CONFIGURED
 **/
@Configuration
public class ConfigComputer {

    @Bean
    public Monitor sonyMonitor() {
        return new SonyMonitor("Curve OLED+", "Sony", 22);
    }

    @Bean
    public Case dellCase() {
        return new DellCase("WWBF-8AX", "DELL", "20v");
    }

    @Bean
    public Motherboard asusMitherboard() {
        return new AsusMotherboard("Z690 pro", "Z-TEC", 4, 5, "UEFI");
    }


}
