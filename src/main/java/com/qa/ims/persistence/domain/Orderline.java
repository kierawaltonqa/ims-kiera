package com.qa.ims.persistence.domain;

public class Orderline {
	private Long orderID;
	private Long itemID;
	private int quantity;
	private Long orderlineID;

	public Orderline(Long orderID, Long itemID, int quantity) {
		super();
		this.orderID = orderID;
		this.itemID = itemID;
		this.quantity = quantity;
	}

	public Orderline(Long itemID, int quantity) {
		super();
		this.itemID = itemID;
		this.quantity = quantity;
	}

	public Orderline(Long orderID, Long itemID, int quantity, Long orderlineID) {
		super();
		this.orderID = orderID;
		this.itemID = itemID;
		this.quantity = quantity;
		this.orderlineID = orderlineID;
	}

	@Override
	public String toString() {
		return "orderlineID: " + orderlineID + " orderID: " + orderID + ", itemID: " + itemID + ", quantity: "
				+ quantity;
	}

	public Long getOrderID() {
		return orderID;
	}

	public void setOrderID(Long orderID) {
		this.orderID = orderID;
	}

	public Long getItemID() {
		return itemID;
	}

	public void setItemID(Long itemID) {
		this.itemID = itemID;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Long getOrderlineID() {
		return orderlineID;
	}

	public void setOrderlineID(Long orderlineID) {
		this.orderlineID = orderlineID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((itemID == null) ? 0 : itemID.hashCode());
		result = prime * result + ((orderID == null) ? 0 : orderID.hashCode());
		result = prime * result + ((orderlineID == null) ? 0 : orderlineID.hashCode());
		result = prime * result + quantity;
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
		Orderline other = (Orderline) obj;
		if (itemID == null) {
			if (other.itemID != null)
				return false;
		} else if (!itemID.equals(other.itemID))
			return false;
		if (orderID == null) {
			if (other.orderID != null)
				return false;
		} else if (!orderID.equals(other.orderID))
			return false;
		if (orderlineID == null) {
			if (other.orderlineID != null)
				return false;
		} else if (!orderlineID.equals(other.orderlineID))
			return false;
		if (quantity != other.quantity)
			return false;
		return true;
	}

}