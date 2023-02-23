package com.cydeo.casefactory;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Case {

    private String model;
    private String manufacturer;
    private String powerSupply;
    private CaseDimensions dimensions;  // [HAS-A] Relationship to {Dimensions Class} *requires @Bean wiring*

    public Case(String model, String manufacturer, String powerSupply, CaseDimensions dimensions) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.powerSupply = powerSupply;
        this.dimensions = dimensions;
    }

    public abstract void pressPowerButton();
}
