package com.ey.logging;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;

public class PizzaShoppie {
	private static final Log LOGGER = LogFactory.getLog(PizzaShoppie.class);
	
	public static void main(String[] args) {
		LOGGER.info("main started..");
		try {
			List<Pizza> pizzasOrdered = new ArrayList<>();
			pizzasOrdered.add(new Pizza(PizzaSize.REGULAR));
			pizzasOrdered.add(new Pizza(PizzaSize.MEDIUM));
			pizzasOrdered.add(new Pizza(PizzaSize.LARGE));
			Foodie foodie = new Foodie("Jacob", 1090.00, pizzasOrdered);
			PizzaService pizzaService = new PizzaService();
			Double totalCost = pizzaService.purchasePizza(foodie);
			
			LOGGER.info("Your order is placed and the total cost is "+totalCost);
		} catch(Exception e) {
			LOGGER.error(e.getMessage());
		}
		LOGGER.info("main stopped..");
		
	}
}
