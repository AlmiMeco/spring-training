package com.cydeo.streotype_annotation;

import com.cydeo.streotype_annotation.casefactory.Case;
import com.cydeo.streotype_annotation.monitorfactory.Monitor;
import com.cydeo.streotype_annotation.motherboardfactory.Motherboard;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Autowired Annotation Can Be Injected In 3 Places - - > [FIELD, CONSTRUCTOR, & SETTER]
 **/
@Getter
@Component
public class PCwAutowiredAnnotation {

    @Autowired // <-- Field Injection (depreciated soon)
    private Case theCase;
    @Autowired // <-- ******
    private Monitor monitor;
    @Autowired // <-- ******
    private Motherboard motherboard;

    @Autowired // <-- Constructor Injection (implicitly applied if only ONE constructor in @Component Class)
    public PCwAutowiredAnnotation(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    @Autowired // <-- Setter Injection (depreciated soon)
    public void setMotherboard(Motherboard motherboard) {
        this.motherboard = motherboard;
    }
}
