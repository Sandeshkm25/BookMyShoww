package com.bookmyshow.model;

import java.util.List;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
@Component
public class CinemaHall {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private int totalSeats;
	private int remainingSeats;
	@ManyToOne(fetch =FetchType.LAZY)
	 @JoinColumn(name = "movie_id", foreignKey = @ForeignKey(name = "fk_cinema_hall_movie"))
	private Movie movie;
	@ManyToOne(fetch =FetchType.LAZY)
	@JoinColumn(name = "cinema_id", foreignKey = @ForeignKey(name = "fk_cinema_hall_cinema"))
	private Cinema cinema;
	@OneToMany(fetch =FetchType.LAZY,mappedBy = "cinemaHall")
	private List<Shows> shows;

	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public int getTotalSeats() {
		return totalSeats;
	}
	public void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}
	public Movie getMovie() {
		return movie;
	}
	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	public Cinema getCinema() {
		return cinema;
	}
	public void setCinema(Cinema cinema) {
		this.cinema = cinema;
	}
	
	public int getRemainingSeats() {
		return remainingSeats;
	}
	public void setRemainingSeats(int remainingSeats) {
		this.remainingSeats = remainingSeats;
	}
	public List<Shows> getShows() {
		return shows;
	}
	public void setShows(List<Shows> shows) {
		this.shows = shows;
	}
	
	
}
