package com.pincode.distance.services;

import java.io.IOException;

import org.springframework.stereotype.Service;

import com.google.maps.DirectionsApi;
import com.google.maps.DirectionsApiRequest;
import com.google.maps.GeoApiContext;
import com.google.maps.errors.ApiException;
import com.google.maps.model.DirectionsResult;
import com.pincode.distance.response.RouteResponse;

@Service
public class GoogleMapsService {

	private static final String API_KEY = "YOUR_GOOGLE_MAPS_API_KEY";

	public RouteResponse getRouteDetails(String fromPincode, String toPincode)
			throws ApiException, InterruptedException, IOException {
		GeoApiContext context = new GeoApiContext.Builder().apiKey(API_KEY).build();

		DirectionsApiRequest request = DirectionsApi.getDirections(context, fromPincode, toPincode);
		DirectionsResult result = request.await();

		// Extract distance, duration, and route details from the result
		long distance = result.routes[0].legs[0].distance.inMeters;
		long duration = result.routes[0].legs[0].duration.inSeconds;
		String route = result.routes[0].summary;

		return new RouteResponse(distance, duration, route);
	}
}
