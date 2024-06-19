package com.ey.beans;

public class Order {
	 Integer orderId;
	 Double orderAmount;
	 
public Order(){}

public Order(Integer orderId, Double orderAmount) {
	super();
	this.orderId = orderId;
	this.orderAmount = orderAmount;
}

public Integer getOrderId() {
	return orderId;
}

public void setOrderId(Integer orderId) {
	this.orderId = orderId;
}

public Double getOrderAmount() {
	return orderAmount;
}

public void setOrderAmount(Double orderAmount) {
	this.orderAmount = orderAmount;
}

@Override
public String toString() {
	return "Order [orderId=" + orderId + ", orderAmount=" + orderAmount + "]";
}

}
