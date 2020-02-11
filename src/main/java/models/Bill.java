package models;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Bill implements Serializable{
	
	private static final long SerialVersionUID = 1L;  
	
	@Id
	@SequenceGenerator(name="BILL_ID_GENERATOR", sequenceName="BILL_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="BILL_ID_GENERATOR")
	private Integer id;
	
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd/MM/yyyy")
    private LocalDate date_of_issue;
	
   
	private int time_limit;
	
	@NotBlank(message = "Total amount cannot be empty.")
	private double total_amount;
	
	@NotBlank(message = "Debt cannot be empty.")
	private double dept;

	public Bill() {
		super();
	}

	public Bill(Integer id, LocalDate date_of_issue, int time_limit,
			@NotBlank(message = "Total amount cannot be empty.") double total_amount,
			@NotBlank(message = "Debt cannot be empty.") double dept) {
		super();
		this.id = id;
		this.date_of_issue = date_of_issue;
		this.time_limit = time_limit;
		this.total_amount = total_amount;
		this.dept = dept;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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
}
