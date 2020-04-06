package com.coronatracker.coronatracker.services;

import java.util.Arrays;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.coronatracker.coronatracker.Model.GlobalData;
import com.coronatracker.coronatracker.dao.GlobalDataRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

@Service
public class CoronaVirusTotalData {
	private String url="https://corona.lmao.ninja/all";
	
		private GlobalData data;
		@Autowired
       private GlobalDataRepository repo;
	
	@PostConstruct
	@Transactional
	// Scheduled(cron="59 * * * * *")
	public void fetchData() throws JsonMappingException, JsonProcessingException {
		 RestTemplate restTemplate = new RestTemplate();		
		 HttpHeaders headers = new HttpHeaders();
		  headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
         headers.add("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36");
         HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
         
         ResponseEntity<GlobalData> response =
        		 restTemplate.exchange(url, HttpMethod.GET, entity,  new ParameterizedTypeReference<GlobalData>() {});
 		this.data= response.getBody();   
 		
         repo.save(response.getBody() );
		
		}
	
	

	
	
	public GlobalData getData() {
		return data;
	}
	
	
	
	

}
