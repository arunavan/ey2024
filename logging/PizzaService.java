package com.ey.logging;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class PizzaService {
	private static final Log LOGGER = LogFactory.getLog(PizzaService.class);

	public Double purchasePizza(Foodie foodie) throws InfyAcademyException {
		LOGGER.info("in purchase piza app");
		PizzaValidator pizzaValidator = new PizzaValidator();
		pizzaValidator.validate(foodie);
		LOGGER.warn(" performace warning");
		Double totalCost = this.calculateCost(foodie.getPizzasOrdered());
		if(totalCost>foodie.getWalletBalance())
			throw new InfyAcademyException("Service.INSUFFICIENT_WALLET_BALANCE");
		return totalCost;
		
	}
	
	//return the total cost of all the Pizza objects in the List
	public Double calculateCost(List<Pizza> pizzasOrdered) {
		return pizzasOrdered.stream().mapToDouble(pizza -> pizza.getCost()).sum();
	}
}
