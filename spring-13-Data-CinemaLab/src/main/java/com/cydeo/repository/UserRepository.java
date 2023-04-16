package com.cydeo.repository;


import com.cydeo.entity.UserAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<UserAccount, Long> {

    // ------------------- DERIVED QUERIES ------------------- //

    //Write a derived query to read a user with an email?

    List<UserAccount> findByEmail(String email);

    //Write a derived query to read a user with a username?

    List<UserAccount> findByUsername(String useerName);

    //Write a derived query to list all users that contain a specific name?

    List<UserAccount> findAllByAccountDetails_Name(String name);

    //Write a derived query to list all users that contain a specific name in the ignore case mode?

    List<UserAccount> findAllByAccountDetailsIgnoreCaseName(String name);

    //Write a derived query to list all users with an age greater than a specified age?

    List<UserAccount> findByAccountDetails_AgeGreaterThan(Integer age);

    // ------------------- JPQL QUERIES ------------------- //

    //Write a JPQL query that returns a user read by email?

    @Query("SELECT u FROM UserAccount u WHERE u.email = ?1 ")
    List<UserAccount> returnUserViaEmail(String email);

    //Write a JPQL query that returns a user read by username?
    @Query("SELECT u FROM UserAccount u WHERE u.username = ?1 ")
    List<UserAccount> returnUserViaUserName(String userName);

    //Write a JPQL query that returns all users?
    @Query("SELECT u FROM UserAccount u")
    List<UserAccount> returnAll();

}