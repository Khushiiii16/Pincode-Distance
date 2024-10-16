package com.pincode.distance;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.stereotype.Service;

import com.google.maps.errors.ApiException;
import com.pincode.distance.response.RouteResponse;
import com.pincode.distance.services.GoogleMapsService;

@EnableCaching
@SpringBootApplication
public class PincodeDistanceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PincodeDistanceApplication.class, args);
	}

	@Service
	public class RouteService {

		@Autowired
		private GoogleMapsService googleMapsService;

		@Cacheable("routes")
		public RouteResponse getDistanceAndDuration(String fromPincode, String toPincode)
				throws ApiException, InterruptedException, IOException {
			return googleMapsService.getRouteDetails(fromPincode, toPincode);
		}
	}

}
