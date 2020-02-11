package models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotBlank;



@Entity
public class Service implements Serializable{
	private static final long SerialVersionUID = 1L;  

	@Id
	@SequenceGenerator(name="SERVICE_ID_GENERATOR", sequenceName="SERVICE_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SERVICE_ID_GENERATOR")
	private Integer id;
	
	@NotBlank(message="Name cannot be empty!")
	private String name;
	
	@NotBlank(message="Name cannot be empty!")
	private double price;
	private Measure measure;
	public enum Measure {
		HOUR, 
		DAY,
		PIECE
	} 
	

	public Service() {
		super();	
	}


	public Service(Integer id, @NotBlank(message = "Name cannot be empty!") String name,
			@NotBlank(message = "Name cannot be empty!") double price, Measure measure) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.measure = measure;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
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
