package com.coronatracker.coronatracker.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.coronatracker.coronatracker.Model.CovidCountry;

public interface CoronaVirusDao  extends JpaRepository<CovidCountry,Long> {
	
	@Query(value = "SELECT * FROM COVID_COUNTRY WHERE COUNTRY = ?1", nativeQuery = true)
	public CovidCountry getByName(String country);
	
	//@Query(value = "DELETE FROM COVID_COUNTRY WHERE COUNTRY = ?1", nativeQuery = true)
	//public CovidCountry deleteByName(String country);

}
