package in.stack.hibernatedemo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Customers")
public class Customers {
	
	private long customerId;
	private String name;
	private String phoneNo;
	
	public Customers() {}
	
	
	
	
	public Customers(String name, String phoneNo) {
		super();
		this.name = name;
		this.phoneNo = phoneNo;
	}




	@Id
	@GeneratedValue
	@Column(name="custId")
	public long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}
	
	@Column(name="custName")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Column(name="custPhone")
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	

}
