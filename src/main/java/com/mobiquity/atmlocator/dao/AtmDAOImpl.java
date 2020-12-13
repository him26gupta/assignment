package com.mobiquity.atmlocator.dao;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mobiquity.atmlocator.entity.AtmDetails;

@Repository
public class AtmDAOImpl implements AtmDAO {

	private static final String URL = "https://www.ing.nl/api/locator/atms/";

	@Autowired
	private RestTemplate restTemplate;

	@Override
	public List<AtmDetails> getATM() throws IOException {
		String response = restTemplate.getForObject(URL, String.class);
		String toParsedResponse = response.substring(6, response.length());
		ObjectMapper objectMapper = new ObjectMapper();
		AtmDetails[] ingAtmLocations = objectMapper.readValue(toParsedResponse, AtmDetails[].class);
		return Arrays.asList(ingAtmLocations);
	}
}
