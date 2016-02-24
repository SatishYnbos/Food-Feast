package com.models;

import com.listtypeservices.SelectionList;

/**
 * This class provides the details of Order.
 * 
 * @author satish
 *
 */
public class Order {
	private int orderID;
	private String nameOfTheCustomer;
	private String customerMobileNumber;
	private SelectionList selectionByCustomer;

	/**
	 * This constructor provides the values to construct the Order object.
	 * 
	 * @param oID
	 * @param name
	 * @param mobileNo
	 */
	public Order(int oID, String name, String mobileNo) {
		orderID = oID;
		nameOfTheCustomer = name;
		customerMobileNumber = mobileNo;
	}

	/**
	 * This is a builder method to create Order instances.
	 * 
	 * @param orderID
	 * @param nameOfTheCustomer
	 * @param customerMobileNumber
	 * @return
	 */
	public static Order get(int orderID, String nameOfTheCustomer, String customerMobileNumber) {
		Order order = new Order(orderID, nameOfTheCustomer, customerMobileNumber);
		return order;
	}

	public int getOrderID() {
		return orderID;
	}

	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}

	public String getNameOfTheCustomer() {
		return nameOfTheCustomer;
	}

	public void setNameOfTheCustomer(String nameOfTheCustomer) {
		this.nameOfTheCustomer = nameOfTheCustomer;
	}

	public String getCustomerMobileNumber() {
		return customerMobileNumber;
	}

	public void setCustomerMobileNumber(String customerMobileNumber) {
		this.customerMobileNumber = customerMobileNumber;
	}

	public SelectionList getSelectionByCustomer() {
		return selectionByCustomer;
	}

	public void setselectionByCustomer(SelectionList selectionByCustomer) {
		this.selectionByCustomer = selectionByCustomer;
	}

	@Override
	public String toString() {
		return "Order [orderID=" + orderID + ", nameOfTheCustomer=" + nameOfTheCustomer + ", customerMobileNumber="
				+ customerMobileNumber + ", " + selectionByCustomer + "]";
	}
}
