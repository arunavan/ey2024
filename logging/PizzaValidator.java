package com.ey.logging;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class PizzaValidator {
	private static final Log LOGGER = LogFactory.getLog(PizzaValidator.class);

	public void validate(Foodie foodie) throws InfyAcademyException {
		String errorStatus =  null	;
		LOGGER.info("in validate..");
		if(!isValidWalletBalance(foodie.getWalletBalance()))
		{
			errorStatus="Validator.INVALID_WALLET_BALANCE";
		}
		else if(!isValidPizzasOrdered(foodie.getPizzasOrdered()))
		{
			errorStatus="Validator.INVALID_PIZZAS_ORDERED";
		}
		if (errorStatus != null) {
			InfyAcademyException exception = new InfyAcademyException(errorStatus);
			LogFactory.getLog(this.getClass()).error(exception.getMessage(), exception);
			throw exception;
		}
		
	}

	public Boolean isValidWalletBalance(Double walletBalance) {
		return walletBalance >= 0;
	}

	public Boolean isValidPizzasOrdered(List<Pizza> pizzasOrdered) {
		return !(pizzasOrdered == null || pizzasOrdered.isEmpty());
	}
}
