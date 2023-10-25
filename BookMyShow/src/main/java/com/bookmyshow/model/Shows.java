package com.bookmyshow.model;

import java.sql.Date;
import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class Shows {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
	private int showsNo;
	private Date date;
	private  String startTime;
	private  String endTime;
	private double price;
	@ManyToOne(fetch =FetchType.LAZY)
	@JoinColumn(name = "cinema_hall_id",foreignKey = @ForeignKey(name = "fk_shows_cinema_hall"))
	private CinemaHall cinemaHall;
	@OneToMany(fetch =FetchType.LAZY,mappedBy = "show")
	private List<ShowSeat> seat;
	public int getId() {
		return id;
	}
	
	public int getShowsNo() {
		return showsNo;
	}

	public void setShowsNo(int showsNo) {
		this.showsNo = showsNo;
	}

	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public CinemaHall getCinemaHall() {
		return cinemaHall;
	}
	public void setCinemaHall(CinemaHall cinemaHall) {
		this.cinemaHall = cinemaHall;
	}

	public List<ShowSeat> getSeat() {
		return seat;
	}

	public void setSeat(List<ShowSeat> seat) {
		this.seat = seat;
	}
	
	
}

