package com.demo.pojo;
import java.math.BigInteger;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;
@Entity
@Table(name="schedule")

public class Schedule {
	@Id
	@GeneratedValue
	private BigInteger scheduleid;
	private String deptdatetime;
	private String arrdatetime;
	public BigInteger getScheduleid() {
		return scheduleid;
	}
	public void setScheduleid(BigInteger scheduleid) {
		this.scheduleid = scheduleid;
	}
	public String getDeptdatetime() {
		return deptdatetime;
	}
	public void setDeptdatetime(String deptdatetime) {
		this.deptdatetime = deptdatetime;
	}
	public String getArrdatetime() {
		return arrdatetime;
	}
	public void setArrdatetime(String arrdatetime) {
		this.arrdatetime = arrdatetime;
	}
}
	