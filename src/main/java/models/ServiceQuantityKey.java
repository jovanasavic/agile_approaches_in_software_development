package models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable

public class ServiceQuantityKey  implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	public ServiceQuantityKey() {
		super();
	}


	public ServiceQuantityKey(Integer billId, Integer serviceId) {
		super();
		this.billId = billId;
		this.serviceId = serviceId;
	}


	@Column(name = "bill_id")
	private Integer billId;
	
	
	@Column(name = "service_id")
	private Integer serviceId;


	public Integer getBillId() {
		return billId;
	}


	public void setBillId(Integer billId) {
		this.billId = billId;
	}


	public Integer getServiceId() {
		return serviceId;
	}


	public void setServiceId(Integer serviceId) {
		this.serviceId = serviceId;
	}
	
	
	
	
	
	
	

}
