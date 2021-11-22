package com.demo.pojo;
import java.math.BigInteger;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="passengertable")

public class Passenger {
	@Id
	@GeneratedValue
	
	private BigInteger pnrnumber;
	private String passengername;
	private Integer passsengerage;
	private BigInteger passengeruin;
	private Double luggage;
	public BigInteger getPnrnumber() {
		return pnrnumber;
	}
	public void setPnrnumber(BigInteger pnrnumber) {
		this.pnrnumber = pnrnumber;
	}
	public String getPassengername() {
		return passengername;
	}
	public void setPassengername(String passengername) {
		this.passengername = passengername;
	}
	public Integer getPasssengerage() {
		return passsengerage;
	}
	public void setPasssengerage(Integer passsengerage) {
		this.passsengerage = passsengerage;
	}
	public BigInteger getPassengeruin() {
		return passengeruin;
	}
	public void setPassengeruin(BigInteger passengeruin) {
		this.passengeruin = passengeruin;
	}
	public Double getLuggage() {
		return luggage;
	}
	public void setLuggage(Double luggage) {
		this.luggage = luggage;
	}
	

}
