package com.cydeo.streotype_annotation;

import com.cydeo.streotype_annotation.config.StereoypeConfig;
import com.cydeo.streotype_annotation.monitorfactory.Monitor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComputerTest {
    public static void main(String[] args) {

        var container = new AnnotationConfigApplicationContext(StereoypeConfig.class);

        Monitor theMonitor = container.getBean(Monitor.class);
        System.out.println(theMonitor.getSize());

    }
}
