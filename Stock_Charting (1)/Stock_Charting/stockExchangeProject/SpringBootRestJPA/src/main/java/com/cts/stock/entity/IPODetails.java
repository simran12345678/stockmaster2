package com.cts.stock.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="IPODetails")


public class IPODetails {

	@Id
	@Column(name="Ipoid")
	private int ipo_id;
	
	@Column(name="cname")
	private String cname;
	
	@Column(name="exchange")
	private String exchange;
	
	@Column(name="price")
	private int price;
	
	@Column(name="shares")
	private int number_of_shares;
	
	@Column(name="date")
	private String date;
	
	@Column(name="remarks")
	private String remarks;
	
	public int getIpo_id() {
		return ipo_id;
	}
	public void setIpo_id(int ipo_id) {
		this.ipo_id = ipo_id;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getExchange() {
		return exchange;
	}
	public void setExchange(String exchange) {
		this.exchange = exchange;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getNumber_of_shares() {
		return number_of_shares;
	}
	public void setNumber_of_shares(int number_of_shares) {
		this.number_of_shares = number_of_shares;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
}
