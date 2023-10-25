package com.bookmyshow.model;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
public class ShowSeat {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private int seatNo;
	private String isReserved;
	@ManyToOne(fetch =FetchType.LAZY)
	@JoinColumn(name = "shows_id",foreignKey = @ForeignKey(name = "fk_show_seat_show"))
	private Shows show;
	public int getId() {
		return id;
	}
	
	public int getSeatNo() {
		return seatNo;
	}
	public void setSeatNo(int seatNo) {
		this.seatNo = seatNo;
	}
	
	public String isReserved() {
		return isReserved;
	}
	public void setReserved(String isReserved) {
		this.isReserved = isReserved;
	}

	
	}
	
