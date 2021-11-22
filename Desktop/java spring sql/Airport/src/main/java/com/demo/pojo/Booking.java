package com.demo.pojo;
import java.math.BigInteger;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="booking")

public class Booking {
	@Id
	@GeneratedValue
	private BigInteger bookingid;
	private String bookingdate;
	private Integer noofpassengers;
	public BigInteger getBookingid() {
		return bookingid;
	}
	public void setBookingid(BigInteger bookingid) {
		this.bookingid = bookingid;
	}
	public String getBookingdate() {
		return bookingdate;
	}
	public void setBookingdate(String bookingdate) {
		this.bookingdate = bookingdate;
	}
	public Integer getNoofpassengers() {
		return noofpassengers;
	}
	public void setNoofpassengers(Integer noofpassengers) {
		this.noofpassengers = noofpassengers;
	}
}
	