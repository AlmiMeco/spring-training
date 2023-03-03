package com.cydeo.streotype_annotation;

import com.cydeo.streotype_annotation.config.AutoWiring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComputerTest {
    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(AutoWiring.class);

        PCwAutowiredAnnotation myPc = container.getBean(PCwAutowiredAnnotation.class);

        System.out.println(myPc.getTheCase().getCaseDimensions().getDepth());
    }
}
