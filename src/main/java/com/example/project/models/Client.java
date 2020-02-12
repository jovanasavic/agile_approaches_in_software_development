package com.example.project.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Client implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="CLIENT_ID_GENERATOR", sequenceName="CLIENT_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CLIENT_ID_GENERATOR")
	private Integer clientId;
	
	@NotBlank(message="Client company name cannot be empty!")
	private String name;
	
	@NotBlank(message="Client registration number cannot be empty!")
	private String client_reg_number;
	
	private String address;
	
	@Pattern(regexp = "^\\+(?:[0-9] ?){6,14}[0-9]$", message = "Format of number must be +1 123456789")
	private String contact;
	
	@Email(message="Email is not valid!")
	private String email;
	private String account_number;
	
	@ManyToOne
	@JoinColumn(name = "company")
	private Company company;
	
	@OneToMany(mappedBy = "client")
	@JsonIgnore
	private List<Bill> bills;
	
	public Client() {
		
	}
	
	public Client(Integer clientId, String name, String client_reg_number, String address, String contact, String email,
			String account_number) {
		this.clientId = clientId;
		this.name = name;
		this.client_reg_number = client_reg_number;
		this.address = address;
		this.contact = contact;
		this.email = email;
		this.account_number = account_number;
	}
	
	public Integer getClientId() {
		return clientId;
	}

	public void setClientId(Integer clientId) {
		this.clientId = clientId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getClient_reg_number() {
		return client_reg_number;
	}

	public void setClient_reg_number(String client_reg_number) {
		this.client_reg_number = client_reg_number;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAccount_number() {
		return account_number;
	}

	public void setAccount_number(String account_number) {
		this.account_number = account_number;
	}	
}
