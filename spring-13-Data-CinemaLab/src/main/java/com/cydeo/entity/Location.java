package com.cydeo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Entity
@NoArgsConstructor
@Data
public class Location extends BaseEntity {

    private String name, latitude, longitude, country, city, state, postalCode, address;

}
