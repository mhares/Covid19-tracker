package com.coronatracker.coronatracker.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coronatracker.coronatracker.Model.CovidCountry;
import com.coronatracker.coronatracker.dao.CoronaVirusDao;
@Service
public class CoronaVirusServiceImpl implements CoronaVirusService {
	
	@Autowired
	private CoronaVirusDao coronaVirusDao;

	@Override
	@Transactional
	public List<CovidCountry> getAllCountries() {
		return coronaVirusDao.findAll();
	}

	@Override
	@Transactional
	public void saveCountry(CovidCountry country) {
		
		 coronaVirusDao.save(country);
	}

    @Override
	@Transactional
	public CovidCountry getCountryById(long id) {
		Optional<CovidCountry> result=coronaVirusDao.findById(id);
		
		CovidCountry country=null;
		if(result.isPresent())
			country =result.get();
		
		return country;
	}

	@Override
	@Transactional
	public void deleteCountryById(long id) {
		 coronaVirusDao.deleteById(id);
		
	}

	@Override
	@Transactional
	public CovidCountry getByName(String country) {
	     return	 coronaVirusDao.getByName(country);
		
	}

/*	@Override
	public void deleteByName(String country) {
		coronaVirusDao.deleteByName(country);
		
	}*/





}
