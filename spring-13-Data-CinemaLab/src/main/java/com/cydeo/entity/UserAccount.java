package com.cydeo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;

@Entity
@Data
@NoArgsConstructor
public class UserAccount extends BaseEntity {

    private String email, password, username;

    @OneToOne(fetch = FetchType.LAZY)
    private AccountDetails accountDetails;

}
