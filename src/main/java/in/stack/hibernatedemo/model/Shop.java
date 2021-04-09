package in.stack.hibernatedemo.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.JoinColumn;

@Entity
@Table(name="Shop")
public class Shop {
	
	private long shopId;
	private String shopName;
	
	private Set<Customers> shopscustomer=new HashSet<Customers>(0);
	

	public Shop(){}
	
	
	public Shop(String shopName, Set<Customers> shopscustomer) {
		super();
		this.shopName = shopName;
		this.shopscustomer = shopscustomer;
	}


	@Id
	@GeneratedValue
	@Column(name="shopId")
	public long getShopId() {
		return shopId;
	}
	public void setShopId(long shopId) {
		this.shopId = shopId;
	}
	@Column(name="shopName")
	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "SHOP_CUSTOMER", joinColumns = { @JoinColumn(name = "shopId") }, inverseJoinColumns = { @JoinColumn(name = "custId") })


	public Set<Customers> getShopscustomer() {
		return this.shopscustomer;
	}

	public void setShopscustomer(Set<Customers> shopscustomer) {
		this.shopscustomer = shopscustomer;
	}

}
