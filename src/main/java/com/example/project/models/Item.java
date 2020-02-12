package com.example.project.models;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotBlank;

import com.example.project.enums.Measure;

@Entity
public class Item implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="SERVICE_ID_GENERATOR", sequenceName="SERVICE_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SERVICE_ID_GENERATOR")
	private Integer itemId;
	
	@NotBlank(message="Price cannot be empty!")
	private double price;
	
	private Measure measure;
	
	@ManyToOne
	@JoinColumn(name = "bill")
	private Bill bill;
	
	@ManyToOne
	@JoinColumn(name = "itemName")
	private ItemName itemName;
	
	public Item() {
	}

	public Item(Integer itemId, ItemName itemName,
			@NotBlank(message = "Price cannot be empty!") double price, Measure measure) {
		this.itemId = itemId;
		this.itemName = itemName;
		this.price = price;
		this.measure = measure;
	}
	
	public Integer getItemId() {
		return itemId;
	}
	
	public void setItemId(Integer serviceId) {
		this.itemId = serviceId;
	}

	public ItemName getItemName() {
		return itemName;
	}

	public void setItemName(ItemName itemName) {
		this.itemName = itemName;
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
