package com.cydeo.streotype_annotation.monitorfactory;

import org.springframework.stereotype.Component;

@Component
public class AsusMonitor extends Monitor {


    public AsusMonitor() {
        super("40 on Creature", "ASUS", 40);
    }

    @Override
    public void drawPixelAt() {

    }
}
