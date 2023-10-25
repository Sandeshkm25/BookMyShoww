package com.bookmyshow.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bookmyshow.model.Movie;

public interface MovieRepo extends JpaRepository<Movie, Integer>{

}
