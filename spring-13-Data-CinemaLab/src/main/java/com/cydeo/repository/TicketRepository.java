package com.cydeo.repository;

import com.cydeo.entity.Ticket;
import com.cydeo.entity.UserAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Long> {

    // ------------------- DERIVED QUERIES ------------------- //

    //Write a derived query to count how many tickets a user bought

    Integer countDistinctByUserAccount(String user);

    //Write a derived query to list all tickets by specific email

    List<Ticket> findAllByUserAccountEmail(String email);

    //Write a derived query to count how many tickets are sold for a specific movie

    Integer countByMovieCinemaDateTime(LocalDateTime time);

    //Write a derived query to list all tickets between a range of dates

    List<Ticket> findAllByDateTimeBetween(LocalDateTime startDate, LocalDateTime endDate);

    // ------------------- JPQL QUERIES ------------------- //

    //Write a JPQL query that returns all tickets are bought from a specific user

    @Query("SELECT t FROM Ticket t WHERE t.userAccount.username = ?1")
    List<Ticket> findAllTicketbyUser(String userName);

    //Write a JPQL query that returns all tickets between a range of dates

    @Query("SELECT t FROM Ticket t WHERE t.dateTime BETWEEN ?1 AND ?2")
    List<Ticket> findAllBetweenTwoDates(LocalDate date1, LocalDate date2);

}