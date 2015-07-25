package co.com.salosoft.infraction.controller;

import static org.junit.Assert.*;

import java.util.LinkedHashMap;
import java.util.List;

import org.junit.Test;
import org.springframework.web.client.RestTemplate;

public class TestParametesController {

	private static final String SERVER_URI = "http://localhost:8080/infraction";

	@Test
	public void testIdentificationTypes() {
		RestTemplate restTemplate = new RestTemplate();
		List<LinkedHashMap<?,?>> identificationTypes = restTemplate.getForObject( SERVER_URI + RestURIConstants.GET_IDENTIFICATION_TYPE, List.class );
		assertNotNull( identificationTypes );
		assertTrue( identificationTypes.size() > 0 );
	}

}
