package models;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Payment implements Serializable {
 

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="SERVICE_ID_GENERATOR", sequenceName="SERVICE_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SERVICE_ID_GENERATOR")
	private Integer paymentId;
	
	private double amount;
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd/MM/yyyy")
    private LocalDate date_of_issue;
	
	public Payment () {
		
		}
	
	
	public Payment(Integer paymentId, double amount, LocalDate date_of_issue) {
		super();
		this.paymentId = paymentId;
		this.amount = amount;
		this.date_of_issue = date_of_issue;
	}
	
	@ManyToOne
	@JoinColumn (name = "bill")
	private Bill bill;


	public Integer getPaymentId() {
		return paymentId;
	}


	public void setPaymnetId(Integer paymentId) {
		this.paymentId = paymentId;
	}


	public double getAmount() {
		return amount;
	}


	public void setAmount(double amount) {
		this.amount = amount;
	}


	public LocalDate getDate_of_issue() {
		return date_of_issue;
	}


	public void setDate_of_issue(LocalDate date_of_issue) {
		this.date_of_issue = date_of_issue;
	}
	
	
	
	

}
