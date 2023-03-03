package com.cydeo.casefactory;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class CaseDimensions {

    private int width, heighth, depth;


    public void pressPowerButton() {
        System.out.println("Turned On");
    }

}
