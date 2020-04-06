package com.coronatracker.coronatracker.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.coronatracker.coronatracker.Model.CovidCountry;
import com.coronatracker.coronatracker.services.CoronaVirusService;


@org.springframework.web.bind.annotation.RestController
public class RestController {
	private CoronaVirusService coronaVirusService;
	
	@Autowired
	 public RestController(CoronaVirusService coronaVirusService) {
	   this.coronaVirusService=coronaVirusService;
	}
	
	@RequestMapping("/countries")
	public List<CovidCountry> getAllCountries(){
		return coronaVirusService.getAllCountries();
	}
	

	
	@GetMapping("/countries/{country}")
	public CovidCountry getByname(@PathVariable String country) {
		CovidCountry c = coronaVirusService.getByName(country);
		
		return c;
	}
	
	@PostMapping("/add")
	public void addCountry(@RequestBody CovidCountry country) {
	  coronaVirusService.saveCountry(country);	
	}
	
	@DeleteMapping("/delete/{country}")
	public void deleteCountry(@PathVariable String country) {
		
		CovidCountry c = coronaVirusService.getByName(country);
		long id = c.getId();
		
		coronaVirusService.deleteCountryById(id);
	}

	
	

}
