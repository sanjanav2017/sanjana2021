package com.demo.pojo;
import java.math.BigInteger;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;
@Entity
@Table(name="scheduledflight")

public class Scheduledflight {
	@Id
	@GeneratedValue
	private BigInteger scheduledflightid;
	private Integer availableseats;
	public BigInteger getScheduledflightid() {
		return scheduledflightid;
	}
	public void setScheduledflightid(BigInteger scheduledflightid) {
		this.scheduledflightid = scheduledflightid;
	}
	public Integer getAvailableseats() {
		return availableseats;
	}
	public void setAvailableseats(Integer availableseats) {
		this.availableseats = availableseats;
	}
}