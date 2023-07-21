package com.graphqldemo.model;

import lombok.Data;

@Data
public class CustomerInfo {

	private int customerId;
	private String firstName;
	private String lastName;
	private String address;
}
