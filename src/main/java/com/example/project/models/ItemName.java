package com.example.project.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class ItemName implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@SequenceGenerator(name="ITEM_NAME_ID_GENERATOR", sequenceName="ITEM_NAME_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ITEM_NAME_ID_GENERATOR")
	private Integer itemNameId;
	private String name;
	
	@OneToMany(mappedBy = "itemName")
	@JsonIgnore
	private List<Item> items;
	
	public ItemName() {
	}
	
	public ItemName(Integer itemNameId, String name, List<Item> items) {
		this.itemNameId = itemNameId;
		this.name = name;
		this.items = items;
	}

	public Integer getItemNameId() {
		return itemNameId;
	}

	public void setItemNameId(Integer itemNameId) {
		this.itemNameId = itemNameId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}
}
