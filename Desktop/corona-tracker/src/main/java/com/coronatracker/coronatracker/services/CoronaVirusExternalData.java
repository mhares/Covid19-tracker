package com.coronatracker.coronatracker.services;

import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.coronatracker.coronatracker.Model.CovidCountry;
import com.coronatracker.coronatracker.dao.CoronaVirusDao;

@Service
public class CoronaVirusExternalData {
	private  String url="https://corona.lmao.ninja/countries";
	private  List<CovidCountry> countries;
	
	@Autowired
	private  CoronaVirusDao coronaVirusDao;
	
	
	@PostConstruct
	@Transactional
//	@Scheduled(cron="* 1 * * * *")
	public   void fetchData() {
		 RestTemplate restTemplate = new RestTemplate();	
		 HttpHeaders headers = new HttpHeaders();
         headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
         headers.add("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36");
         HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
		    
		    ResponseEntity<List<CovidCountry>> response =restTemplate.exchange(url, HttpMethod.GET, entity,  new ParameterizedTypeReference<List<CovidCountry>>() {});
		this.countries= response.getBody();   
		
		for(int i=0; i<this.countries.size();i++) {
			CovidCountry country = this.countries.get(i);
			country.setId((long)i+1);
			System.out.println(country);
			country.setId((long)i+1);
			System.out.println(coronaVirusDao);
			coronaVirusDao.save(country);
		}
	}


	
	

	public List<CovidCountry> getCountries() {
		return countries;
	}
	
	

}
