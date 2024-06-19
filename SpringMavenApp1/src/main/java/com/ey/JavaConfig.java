package com.ey;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.ey.beans.Account;
import com.ey.beans.Customer;
import com.ey.beans.Order;

@Configuration
public class JavaConfig {
	@Bean
	@Scope("prototype")
	public Order order() {
		return new Order(123,9999.99);
	}
	@Bean
	public Customer customer() {
		return new Customer();
	}
	@Bean
	public Account account() {
		return new Account(10,"Ram");
		
	}
}
