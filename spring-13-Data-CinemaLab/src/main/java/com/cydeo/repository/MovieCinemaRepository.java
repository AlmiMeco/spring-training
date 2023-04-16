package com.cydeo.repository;

import com.cydeo.entity.Cinema;
import com.cydeo.entity.MovieCinema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Repository
public interface MovieCinemaRepository extends JpaRepository<MovieCinema, Long> {

    // ------------------- DERIVED QUERIES ------------------- //

    //Write a derived query to read movie cinema with id

    Optional<MovieCinema> findById(Long id);

    //Write a derived query to count all movie cinemas with a specific cinema id

    Integer countAllByCinemaId(Long id);

    //Write a derived query to count all movie cinemas with a specific movie id

    Integer countAllByMovieId(Long id);

    //Write a derived query to list all movie cinemas with higher than a specific date

    List<MovieCinema> findAllByDateTimeAfter(LocalDateTime time);

    //Write a derived query to find the top 3 expensive movies

    List<MovieCinema> findTop3ByMoviePrice(Integer price);

    //Write a derived query to list all movie cinemas that contain a specific movie name

    List<MovieCinema> findAllByMovieName(String name);

    //Write a derived query to list all movie cinemas in a specific location name

    List<MovieCinema> findAllByCinemaLocation(String location);


    // ------------------- JPQL QUERIES ------------------- //

    //Write a JPQL query to list all movie cinemas with higher than a specific date

    @Query("SELECT m FROM MovieCinema m WHERE m.dateTime = ?1")
    List<MovieCinema> findFutureMovies(LocalDateTime time);



}