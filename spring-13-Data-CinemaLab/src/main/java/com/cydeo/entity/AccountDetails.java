package com.cydeo.entity;

import com.cydeo.enums.Role;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
public class AccountDetails extends BaseEntity {

    private String name, address, country, city, state, postalCode;

    private Integer age;

    @Enumerated(EnumType.STRING)
    private Role role;


}
