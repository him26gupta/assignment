package com.mobiquity.atmlocator.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.mobiquity.atmlocator.entity.AtmDetails;
import com.mobiquity.atmlocator.service.AtmService;

/**
 * @author Himanshu Gupta
 *
 */
@RestController
public class AtmController {
	private final AtmService atmService;

	@Autowired
	public AtmController(AtmService atmService) {
		this.atmService = atmService;
	}

	@GetMapping(value = "/atmLocations", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<AtmDetails> fetchATM() throws Exception {
		return atmService.getATM();
	}

	@GetMapping(value = "/atmLocations/{city}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<AtmDetails> fetchATM(@PathVariable("city") String city) throws Exception {
		return atmService.getATM(city);
	}
}
