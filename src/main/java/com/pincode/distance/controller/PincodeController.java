package com.pincode.distance.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.google.maps.errors.ApiException;
import com.pincode.distance.PincodeDistanceApplication.RouteService;
import com.pincode.distance.response.RouteResponse;

@RestController
@RequestMapping("/api/pincode")
public class PincodeController {

	@Autowired
	private RouteService routeService;

	@GetMapping("/distance")
	public ResponseEntity<RouteResponse> getDistance(@RequestParam String fromPincode, @RequestParam String toPincode)
			throws ApiException, InterruptedException, IOException {

		RouteResponse response = routeService.getDistanceAndDuration(fromPincode, toPincode);
		return ResponseEntity.ok(response);
	}
}
