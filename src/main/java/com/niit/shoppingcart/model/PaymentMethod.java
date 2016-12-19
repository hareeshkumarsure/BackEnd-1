package com.niit.shoppingcart.model;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component

public class PaymentMethod implements Serializable{
private String PaymentMethod;

public String getPaymentMethod() {
	return PaymentMethod;
}

public void setPaymentMethod(String paymentMethod) {
	this.PaymentMethod = paymentMethod;
}

}
