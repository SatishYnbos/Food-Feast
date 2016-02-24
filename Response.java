package com.models;

/**
 * This class provides the details of Response.
 * 
 * @author satish
 *
 */
public class Response {
	private Order customerOrderIDAndDetails;

	/**
	 * This constructor provides the values to construct Response object.
	 * 
	 * @param cOrder
	 */
	public Response(Order cOrder) {
		customerOrderIDAndDetails = cOrder;
	}

	/**
	 * This is a builder method to create Response instances.
	 * 
	 * @param customerOrderIDAndDetails
	 * @return
	 */
	public static Response get(Order customerOrderIDAndDetails) {
		Response response = new Response(customerOrderIDAndDetails);
		return response;
	}

	public Order getCustomerOrderIDAndDetails() {
		return customerOrderIDAndDetails;
	}

	public void setCustomerOrderIDAndDetails(Order customerOrderIDAndDetails) {
		this.customerOrderIDAndDetails = customerOrderIDAndDetails;
	}

	/**
	 * This method takes the customer as an argument and return customer's order
	 * details.
	 * 
	 * @param customer
	 * @return
	 */
	public Order customerOrderDetails(Customer customer) {
		return customerOrderIDAndDetails;
	}

	/**
	 * This method takes the customer name as an argument and return his order
	 * confirmation as a String.
	 * 
	 * @param customerName
	 * @return
	 */
	public String orderConfirmation(String customerName) {
		return customerName;
	}

	@Override
	public String toString() {
		return "Response [customerOrderIDAndDetails=" + customerOrderIDAndDetails + "]";
	}
}
