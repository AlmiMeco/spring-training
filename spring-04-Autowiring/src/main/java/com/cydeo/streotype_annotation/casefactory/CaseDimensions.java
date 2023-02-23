package com.cydeo.streotype_annotation.casefactory;


import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
//@AllArgsConstructor
@Component
public class CaseDimensions {

    private int width;
    private int height;
    private int depth;

    public CaseDimensions() {
        this.width=10;
        this.height=30;
        this.depth=40;
    }

    public void pressPowerButton(){
        System.out.println("Power button pressed");
    }
}
