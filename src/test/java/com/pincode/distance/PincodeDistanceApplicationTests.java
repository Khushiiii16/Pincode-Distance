//package com.pincode.distance;
//
//import static org.junit.jupiter.api.Assertions.assertNotNull;
//import static org.junit.jupiter.api.Assertions.assertTrue;
//
//import java.io.IOException;
//
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import com.google.maps.errors.ApiException;
//import com.pincode.distance.PincodeDistanceApplication.RouteService;
//import com.pincode.distance.response.RouteResponse;
//
//@SpringBootTest
//class PincodeDistanceApplicationTests {
//
//	@Autowired
//	private RouteService routeService;
//
//	@Test
//	public void testDistanceCalculation() throws ApiException, InterruptedException, IOException {
//		RouteResponse response = routeService.getDistanceAndDuration("141106", "110060");
//		assertNotNull(response);
//		assertTrue(response.getDistance() > 0);
//		assertTrue(response.getDuration() > 0);
//	}
//
//}
