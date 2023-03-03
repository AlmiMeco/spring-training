package com.cydeo.bean_annotation;

import com.cydeo.bean_annotation.casefactory.Case;
import com.cydeo.bean_annotation.config.ConfigComputer;
import com.cydeo.bean_annotation.monitorfactory.Monitor;
import com.cydeo.bean_annotation.motherboardfactory.Motherboard;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringContainer {

    public static void main(String[] args) {

        /*Creating Containers*/
//                                           adding config file/class to container ---VVVVV
        ApplicationContext container = new AnnotationConfigApplicationContext(ConfigComputer.class);

//    creating objects with (.getBean) method instead of "new" keyword
        Monitor beanMonitor = container.getBean(Monitor.class);
        Case beanCase = container.getBean(Case.class);
        Motherboard beanMotherboard = container.getBean(Motherboard.class);


        PC myPC = new PC(beanCase, beanMonitor, beanMotherboard);
        myPC.powerUp();


    }


}
