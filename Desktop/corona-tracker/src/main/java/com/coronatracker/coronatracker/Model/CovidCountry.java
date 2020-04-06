package com.coronatracker.coronatracker.Model;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="covid_country")
public class CovidCountry {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@Column(name="country")
	private String country;
	
	@Embedded
	private CountryInfo countryInfo;
	
	@Column(name="cases")
	private long cases;
	
	@Column(name="today_cases")
	private long todayCases;
	
	@Column(name="deaths")
	private long deaths;
	
	@Column(name="today_deaths")
	private long todayDeaths;
	
	@Column(name="recovered")
	private long recovered;
	
	@Column(name="active")
	private long active;
	
	@Column(name="critical")
	private long critical;
	
	@Column(name="cases_per_one_million")
	private double casesPerOneMillion;
	
	@Column(name="deaths_per_one_million")
	private double deathsPerOneMillion;
	
	
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public CountryInfo getCountryInfo() {
		return countryInfo;
	}


	public void setCountryInfo(CountryInfo countryInfo) {
		this.countryInfo = countryInfo;
	}


	public long getCases() {
		return cases;
	}


	public void setCases(long cases) {
		this.cases = cases;
	}


	public long getTodayCases() {
		return todayCases;
	}


	public void setTodayCases(long todayCases) {
		this.todayCases = todayCases;
	}


	public long getDeaths() {
		return deaths;
	}


	public void setDeaths(long deaths) {
		this.deaths = deaths;
	}


	public long getTodayDeaths() {
		return todayDeaths;
	}


	public void setTodayDeaths(long todayDeaths) {
		this.todayDeaths = todayDeaths;
	}


	public long getRecoveres() {
		return recovered;
	}


	public void setRecoveres(long recovered) {
		this.recovered = recovered;
	}


	public long getActive() {
		return active;
	}


	public void setActive(long active) {
		this.active = active;
	}


	public long getCritical() {
		return critical;
	}


	public void setCritical(long critical) {
		this.critical = critical;
	}


	public double getCasesPerOneMillion() {
		return casesPerOneMillion;
	}


	public void setCasesPerOneMillion(double casesPerOneMillion) {
		this.casesPerOneMillion = casesPerOneMillion;
	}


	public double getDeathsPerOneMillion() {
		return deathsPerOneMillion;
	}


	public void setDeathsPerOneMillion(double deathsPerOneMillion) {
		this.deathsPerOneMillion = deathsPerOneMillion;
	}


	@Override
	public String toString() {
		return "CovidCountry [id=" + id + ", country=" + country + ", countryInfo=" + countryInfo + ", cases=" + cases
				+ ", todayCases=" + todayCases + ", deaths=" + deaths + ", todayDeaths=" + todayDeaths + ", recoveres="
				+ recovered + ", active=" + active + ", critical=" + critical + ", casesPerOneMillion="
				+ casesPerOneMillion + ", deathsPerOneMillion=" + deathsPerOneMillion + "]";
	}
	
	
	
	

}
