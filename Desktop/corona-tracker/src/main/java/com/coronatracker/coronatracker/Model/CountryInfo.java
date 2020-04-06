package com.coronatracker.coronatracker.Model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import com.fasterxml.jackson.annotation.JsonAlias;

@Embeddable
public class CountryInfo {
	
	@JsonAlias("_id")
	@Column(name="country_id")
	private Long countryId;
	
	@JsonAlias("lat")
	@Column(name="latitude")
	private double latitude;
	
	@JsonAlias("long")
	@Column(name="longtitude")
	private double longtitude;
	
	@Column(name="flag")
	private String flag;
	
	@Column(name="iso_3")
	private String iso3;
	
	@Column(name="iso_2")
	private String iso2;
	public Long getCountryId() {
		return countryId;
	}
	public void setCountryId(Long countryId) {
		countryId = countryId;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public double getLongtitude() {
		return longtitude;
	}
	public void setLongtitude(double longtitude) {
		this.longtitude = longtitude;
	}
	public String getFlag() {
		return flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
	}
	public String getIso3() {
		return iso3;
	}
	public void setIso3(String iso3) {
		this.iso3 = iso3;
	}
	public String getIso2() {
		return iso2;
	}
	public void setIso2(String iso2) {
		this.iso2 = iso2;
	}
	@Override
	public String toString() {
		return "CountryInfo [CountryId=" + countryId + ", latitude=" + latitude + ", longtitude=" + longtitude
				+ ", flag=" + flag + ", iso3=" + iso3 + ", iso2=" + iso2 + "]";
	}
	
	

}
