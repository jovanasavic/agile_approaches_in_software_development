package com.example.project.models;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

@Entity

public class ServiceQuantity {
	
	public ServiceQuantity(ServiceQuantityKey id, Bill bill, Service service, int quantity) {
		super();
		this.id = id;
		this.bill = bill;
		this.service = service;
		this.quantity = quantity;
	}

	public ServiceQuantity() {
		super();
	}

	@EmbeddedId
	ServiceQuantityKey id;
	
	@ManyToOne
	@MapsId("bill_id")
	@JoinColumn(name = "bill_id")
	private Bill bill;
	
	
	@ManyToOne
	@MapsId("service_id")
	@JoinColumn(name = "service_id")
	private Service service;
	
	private int quantity;

	public ServiceQuantityKey getId() {
		return id;
	}

	public void setId(ServiceQuantityKey id) {
		this.id = id;
	}

	public Bill getBill() {
		return bill;
	}

	public void setBill(Bill bill) {
		this.bill = bill;
	}

	public Service getService() {
		return service;
	}

	public void setService(Service service) {
		this.service = service;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	

}
