package com.qa.ims.persistence.domain;

import java.util.List;

public class Order {
	// This class will contain attributes from both the orders and orderline table
	// they are in two distinct tables to handle many-many relations, but the user
	// would enter
	// the details contained in both tables when they are creating an order

	// from orders table
	private Long orderID;
	private Long customerID;
	private String orderDate;

	// from orderline
	private Long orderlineID;
	private List<Long> orderitems;
	private List<Integer> quantity;

	public Order(Long customerID, String orderDate) {
		super();
		this.customerID = customerID;
		this.orderDate = orderDate;
	}

	public Order(Long orderID, Long customerID, String orderDate) {
		super();
		this.orderID = orderID;
		this.customerID = customerID;
		this.orderDate = orderDate;
	}

	public Order(Long orderID, String orderDate, List<Long> orderitems, List<Integer> quantity) {
		super();
		this.orderID = orderID;
		this.orderDate = orderDate;
		this.orderitems = orderitems;
		this.quantity = quantity;
	}

	public Order(String orderDate, List<Long> orderitems, List<Integer> quantity, Long customerID) {
		super();
		this.orderDate = orderDate;
		this.orderitems = orderitems;
		this.quantity = quantity;
		this.customerID = customerID;
	}

	public Order(Long orderID, Long customerID, String orderDate, List<Long> orderitems, List<Integer> quantity) {
		super();
		this.orderID = orderID;
		this.customerID = customerID;
		this.orderDate = orderDate;
		this.orderitems = orderitems;
		this.quantity = quantity;
	}

	public Long getOrderID() {
		return orderID;
	}

	public void setOrderID(Long orderID) {
		this.orderID = orderID;
	}

	public Long getCustomerID() {
		return customerID;
	}

	public void setCustomerID(Long customerID) {
		this.customerID = customerID;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public Long getOrderlineID() {
		return orderlineID;
	}

	public void setOrderlineID(Long orderlineID) {
		this.orderlineID = orderlineID;
	}

	public List<Long> getOrderitems() {
		return orderitems;
	}

	public void setOrderitems(List<Long> orderitems) {
		this.orderitems = orderitems;
	}

	public List<Integer> getQuantity() {
		return quantity;
	}

	public void setQuantity(List<Integer> quantity) {
		this.quantity = quantity;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((customerID == null) ? 0 : customerID.hashCode());
		result = prime * result + ((orderDate == null) ? 0 : orderDate.hashCode());
		result = prime * result + ((orderID == null) ? 0 : orderID.hashCode());
		result = prime * result + ((orderitems == null) ? 0 : orderitems.hashCode());
		result = prime * result + ((orderlineID == null) ? 0 : orderlineID.hashCode());
		result = prime * result + ((quantity == null) ? 0 : quantity.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		if (customerID == null) {
			if (other.customerID != null)
				return false;
		} else if (!customerID.equals(other.customerID))
			return false;
		if (orderDate == null) {
			if (other.orderDate != null)
				return false;
		} else if (!orderDate.equals(other.orderDate))
			return false;
		if (orderID == null) {
			if (other.orderID != null)
				return false;
		} else if (!orderID.equals(other.orderID))
			return false;
		if (orderitems == null) {
			if (other.orderitems != null)
				return false;
		} else if (!orderitems.equals(other.orderitems))
			return false;
		if (orderlineID == null) {
			if (other.orderlineID != null)
				return false;
		} else if (!orderlineID.equals(other.orderlineID))
			return false;
		if (quantity == null) {
			if (other.quantity != null)
				return false;
		} else if (!quantity.equals(other.quantity))
			return false;
		return true;
	}

}
