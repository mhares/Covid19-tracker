package com.coronatracker.coronatracker.services;

import java.util.List;

import com.coronatracker.coronatracker.Model.CovidCountry;

public interface CoronaVirusService {
	public List<CovidCountry> getAllCountries();
	public void saveCountry(CovidCountry country);
	public CovidCountry getCountryById(long id);
	public void deleteCountryById(long id);
	public CovidCountry getByName(String country);
//	public void deleteByName(String country);

}
