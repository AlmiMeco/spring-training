package com.cydeo.repository;

import com.cydeo.entity.AccountDetails;
import com.cydeo.enums.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountRepository extends JpaRepository<AccountDetails, Long> {

    // ------------------- DERIVED QUERIES ------------------- //

    //Write a derived query to list all accounts with a specific country or state

    List<AccountDetails> findByStateOrCountry(String state, String country);


    //Write a derived query to list all accounts with age lower than or equal to a specific value

    List<AccountDetails> findByAgeLessThan(Integer age);

    //Write a derived query to list all accounts with a specific role

    List<AccountDetails> findByRole(Role role);

    //Write a derived query to list all accounts between a range of ages

    List<AccountDetails> findByAgeBetween(Integer age1, Integer age2);

    //Write a derived query to list all accounts where the beginning of the address contains the keyword

    List<AccountDetails> findByAddressStartingWith(String pattern);

    //Write a derived query to sort the list of accounts with age

    List<AccountDetails> findByOrderByAgeDesc();

    // ------------------- JPQL QUERIES ------------------- //

    //Write a JPQL query that returns all accounts

    @Query(" SELECT a FROM AccountDetails a ")
    List<AccountDetails> returnAllAcc();

    //Write a JPQL query to list all admin accounts

    @Query(" SELECT a FROM AccountDetails a WHERE a.role = 'ADMIN' ")
    List<AccountDetails> listAllAdmins();

    //Write a JPQL query to sort all accounts with age
    @Query(" SELECT a FROM AccountDetails a ORDER BY a.age DESC ")
    List<AccountDetails> sortAccByAge();




}