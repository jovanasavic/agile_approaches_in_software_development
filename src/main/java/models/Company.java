package models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Entity
public class Company implements Serializable {
	
	private static final long SerialVersionUID = 1L;  

	
	@Id
	@SequenceGenerator(name="COMPANY_ID_GENERATOR", sequenceName="COMPANY_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="COMPANY_ID_GENERATOR")
	private Integer id;
	
	@NotBlank(message="Name cannot be empty!")
	private String name;
	
	@NotBlank(message="PIB cannot be empty!")
	private String pib;
	private String address;
	
	@Pattern(regexp = "^\\+(?:[0-9] ?){6,14}[0-9]$", message = "Format of number must be +1 123456789")
	private String contact;
	
	@Email(message="Email is not valid!")
	private String email;
	private String account_number;
	
	public Company() {
		super();
		
	}
	
	public Company(Integer id, String name, String pib, String address, String contact, String email,
			String account_number) {
		super();
		this.id = id;
		this.name = name;
		this.pib = pib;
		this.address = address;
		this.contact = contact;
		this.email = email;
		this.account_number = account_number;
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
	public String getPib() {
		return pib;
	}
	public void setPib(String pib) {
		this.pib = pib;
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
