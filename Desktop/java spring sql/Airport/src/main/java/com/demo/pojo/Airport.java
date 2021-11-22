package com.demo.pojo;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="airporttable")

public class Airport {
	@Id
	@GeneratedValue
	private Integer airportcode;
	private String airportLocation;
	private String airportName;
	public Integer getAirportcode() {
		return airportcode;
	}
	public void setAirportcode(Integer airportcode) {
		this.airportcode = airportcode;
	}
	public String getAirportLocation() {
		return airportLocation;
	}
	public void setAirportLocation(String airportLocation) {
		this.airportLocation = airportLocation;
	}
	public String getAirportName() {
		return airportName;
	}
	public void setAirportName(String airportName) {
		this.airportName = airportName;
	}
}