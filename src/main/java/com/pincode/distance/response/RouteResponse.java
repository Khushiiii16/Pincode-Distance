package com.pincode.distance.response;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class RouteResponse {
	private long distance; 
	private long duration;
	private String routeDetails; 

//	// Constructor
//	public RouteResponse(long distance, long duration, String routeDetails) {
//		this.distance = distance;
//		this.duration = duration;
//		this.routeDetails = routeDetails;
//	}
//
//	
//	@Override
//	public String toString() {
//		return "RouteResponse{" + "distance=" + distance + ", duration=" + duration + ", routeDetails='" + routeDetails
//				+ '\'' + '}';
	}
