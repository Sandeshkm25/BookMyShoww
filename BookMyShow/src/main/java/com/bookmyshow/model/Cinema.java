package com.bookmyshow.model;

import java.util.List;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
@Component
public class Cinema{
 
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private int totalCinemaHall;
	private String location;
	@OneToMany(fetch =FetchType.LAZY,  mappedBy = "cinema")
	private List<CinemaHall> cinemaHall;
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTotalCinemaHall() {
		return totalCinemaHall;
	}
	public void setTotalCinemaHall(int totalCinemaHall) {
		this.totalCinemaHall = totalCinemaHall;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public List<CinemaHall> getCinemaHall() {
		return cinemaHall;
	}
	public void setCinemaHall(List<CinemaHall> cinemaHall) {
		this.cinemaHall = cinemaHall;
	}
	
	
}

