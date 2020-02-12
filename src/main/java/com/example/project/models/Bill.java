package com.example.project.models;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Bill implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	@Id
	@SequenceGenerator(name="BILL_ID_GENERATOR", sequenceName="BILL_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="BILL_ID_GENERATOR")
	private Integer billId;
	
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd/MM/yyyy")
    private LocalDate date_of_issue;
	
   
	private int time_limit;
	
	@ManyToOne
	@JoinColumn(name = "client")
	private Client client;
	
	@OneToMany(mappedBy = "bill")
	@JsonIgnore
	private List<Payment> payments;
	
	@ManyToMany
	@JoinTable(
			name = "bill_service",
			joinColumns = @JoinColumn(name = "bill_id"),
			inverseJoinColumns = @JoinColumn(name = "service_id")
			)
	private Set<Service> serviceList;
	
	@OneToMany(mappedBy = "bill")
	private Set<ServiceQuantity> quantities;
	
	
	@NotBlank(message = "Total amount cannot be empty.")
	private double total_amount;
	
	@NotBlank(message = "Debt cannot be empty.")
	private double dept;

	public Bill() {
		super();
	}

	public Bill(Integer billId, LocalDate date_of_issue, int time_limit,
			@NotBlank(message = "Total amount cannot be empty.") double total_amount,
			@NotBlank(message = "Debt cannot be empty.") double dept) {
		super();
		this.billId = billId;
		this.date_of_issue = date_of_issue;
		this.time_limit = time_limit;
		this.total_amount = total_amount;
		this.dept = dept;
	}
	
	

	public Integer getBillId() {
		return billId;
	}

	public void setBillId(Integer billId) {
		this.billId = billId;
	}

	public LocalDate getDate_of_issue() {
		return date_of_issue;
	}

	public void setDate_of_issue(LocalDate date_of_issue) {
		this.date_of_issue = date_of_issue;
	}

	public int getTime_limit() {
		return time_limit;
	}

	public void setTime_limit(int time_limit) {
		this.time_limit = time_limit;
	}

	public double getTotal_amount() {
		return total_amount;
	}

	public void setTotal_amount(double total_amount) {
		this.total_amount = total_amount;
	}

	public double getDept() {
		return dept;
	}

	public void setDept(double dept) {
		this.dept = dept;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}


}
