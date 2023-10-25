package com.bookmyshow.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bookmyshow.model.Shows;

public interface ShowsRepo extends JpaRepository<Shows, Integer>{

}
