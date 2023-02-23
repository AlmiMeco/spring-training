package com.cydeo;

import com.cydeo.casefactory.Case;
import com.cydeo.casefactory.DellCase;
import com.cydeo.config.BeanWiring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(BeanWiring.class);

        Case theCase = container.getBean(Case.class);

        System.out.println(theCase.getDimensions().getDepth());


    }

}
