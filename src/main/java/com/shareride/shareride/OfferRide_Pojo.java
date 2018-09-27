package com.shareride.shareride;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class OfferRide_Pojo {
	@Id
	@GeneratedValue
	private Long offerId;
	private String source;
	private String destination;
	private LocalDate localDate;
	private LocalTime localTime;
	private String stopOver;
	private long noOfSeats;
	private long max2seat;
	private String rideDetails;
	private String termAndcon;
	private boolean seatsFilled;

	public OfferRide_Pojo() {
		// TODO Auto-generated constructor stub
	}

	public OfferRide_Pojo(String source, String destination, LocalDate localDate, LocalTime localTime, String stopOver,
			long noOfSeats, long max2seat, String rideDetails, String termAndcon) {
		super();
		this.source = source;
		this.destination = destination;
		this.localDate = localDate;
		this.localTime = localTime;
		this.stopOver = stopOver;
		this.noOfSeats = noOfSeats;
		this.max2seat = max2seat;
		this.rideDetails = rideDetails;
		this.termAndcon = termAndcon;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public LocalDate getLocalDate() {
		return localDate;
	}

	public void setLocalDate(LocalDate localDate) {
		this.localDate = localDate;
	}

	public LocalTime getLocalTime() {
		return localTime;
	}

	public Long getOfferId() {
		return offerId;
	}

	public void setLocalTime(LocalTime localTime) {
		this.localTime = localTime;
	}

	public String getStopOver() {
		return stopOver;
	}

	public void setStopOver(String stopOver) {
		this.stopOver = stopOver;
	}

	public long getNoOfSeats() {
		return noOfSeats;
	}

	public void setNoOfSeats(long noOfSeats) {
		this.noOfSeats = noOfSeats;
	}

	public long getMax2seat() {
		return max2seat;
	}

	public void setMax2seat(long max2seat) {
		this.max2seat = max2seat;
	}

	public String getRideDetails() {
		return rideDetails;
	}

	public void setRideDetails(String rideDetails) {
		this.rideDetails = rideDetails;
	}

	public String getTermAndcon() {
		return termAndcon;
	}

	public void setTermAndcon(String termAndcon) {
		this.termAndcon = termAndcon;
	}


	public boolean isSeatsFilled() {
		return seatsFilled;
	}

	public void setSeatsFilled(boolean seatsFilled) {
		this.seatsFilled = seatsFilled;
	}

	@Override
	public String toString() {
		return "OfferRide_Pojo [offerId=" + offerId + ", source=" + source + ", destination=" + destination
				+ ", localDate=" + localDate + ", localTime=" + localTime + ", stopOver=" + stopOver + ", noOfSeats="
				+ noOfSeats + ", max2seat=" + max2seat + ", rideDetails=" + rideDetails + ", termAndcon=" + termAndcon
				+ ", seatsFilled=" + seatsFilled + "]";
	}
	
}
