package com.models;

import com.listtypeservices.SelectionList;

/**
 * This class provides the details of Customer.
 * 
 * @author satish
 *
 */
public class Customer {
	private String customerName;
	private String mobileNo;
	private String address;
	private Location location;
	private Order customerOrder;

	/**
	 * This constructor provide the values to Customer object.
	 * 
	 * @param name
	 * @param mNo
	 * @param addr
	 */
	public Customer(String name, String mNo, String addr) {
		customerName = name;
		mobileNo = mNo;
		address = addr;
	}

	public Customer() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * This is a builder method which creates Customer instances.
	 * 
	 * @param customerName
	 * @param mobileNo
	 * @param address
	 * @return
	 */
	public static Customer get(String customerName, String mobileNo, String address) {
		Customer customer = new Customer(customerName, mobileNo, address);
		return customer;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public Order getCustomerOrder() {
		return customerOrder;
	}

	public void setCustomerOrder(Order customerOrder) {
		this.customerOrder = customerOrder;
	}

	/**
	 * This method takes the selection by Customer as an argument and returns response message. 
	 * 
	 * 
	 * @param orderWithSelectedRestaurentAndFood
	 */
	public String placeOrder(SelectionList orderWithSelectedRestaurentAndFood) {
		return "";
	}

	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", mobileNo=" + mobileNo + ", address=" + address
				+ ", location=" + location + ", customerOrder=" + customerOrder + "]";
	}
}
