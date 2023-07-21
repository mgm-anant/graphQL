package com.graphqldemo.model;

import lombok.Data;

@Data
public class Reservation {

	private int reservationId;
	private String confirmationNo;
	private String customerId;
	private String checkInDate;
	private String checkOutDate;
	private int resortCode;
	private int roomId;
	
}
