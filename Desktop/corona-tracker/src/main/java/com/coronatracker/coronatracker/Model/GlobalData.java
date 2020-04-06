package com.coronatracker.coronatracker.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="global_data")
public class GlobalData {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;

	@Column(name="cases")
	private long cases;
	
	@Column(name="deaths")
	private long deaths;
	
	@Column(name="recovered")
	private long recovered;
	
	@Column(name="active")
	private long active;
	
	@Column(name="affected_countries")
	private long affectedCountries;

	public long getCases() {
		return cases;
	}

	public void setCases(long cases) {
		this.cases = cases;
	}

	public long getDeaths() {
		return deaths;
	}

	public void setDeaths(long deaths) {
		this.deaths = deaths;
	}

	public long getRecovered() {
		return recovered;
	}

	public void setRecovered(long recovered) {
		this.recovered = recovered;
	}

	public long getActive() {
		return active;
	}

	public void setActive(long active) {
		this.active = active;
	}

	public long getAffectedCountries() {
		return affectedCountries;
	}

	public void setAffectedCountries(long affectedCountries) {
		this.affectedCountries = affectedCountries;
	}
	
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return " [cases=" + cases + ", deaths=" + deaths + ", recovered=" + recovered + ", active=" + active
				+ ", affectedCountries=" + affectedCountries + "]";
	}
	
	
	
}
