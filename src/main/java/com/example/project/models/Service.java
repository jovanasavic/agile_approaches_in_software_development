package com.example.project.models;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotBlank;



@Entity
public class Service implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="SERVICE_ID_GENERATOR", sequenceName="SERVICE_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SERVICE_ID_GENERATOR")
	private Integer serviceId;
	
	@NotBlank(message="Name cannot be empty!")
	private String name;
	
	@NotBlank(message="Price cannot be empty!")
	private double price;
	private Measure measure;
	public enum Measure {
		HOUR, 
		DAY,
		PIECE
	} 
	@ManyToMany(mappedBy = "serviceList")
	private Set<Bill> billList;
	
	@OneToMany(mappedBy = "service")
	private Set<ServiceQuantity> quantities;

	public Service() {
		super();	
	}


	public Service(Integer serviceId, @NotBlank(message = "Name cannot be empty!") String name,
			@NotBlank(message = "Name cannot be empty!") double price, Measure measure) {
		super();
		this.serviceId = serviceId;
		this.name = name;
		this.price = price;
		this.measure = measure;
	}
	
	
	public Integer getServiceId() {
		return serviceId;
	}


	public void setServiceId(Integer serviceId) {
		this.serviceId = serviceId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public Measure getMeasure() {
		return measure;
	}


	public void setMeasure(Measure measure) {
		this.measure = measure;
	}

	
}
