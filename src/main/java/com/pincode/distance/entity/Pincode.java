package com.pincode.distance.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Pincode {
	@Id
	private String pincode;
	private double latitude;
	private double longitude;
	private String polygonInfo;
}
