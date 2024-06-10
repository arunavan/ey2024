package com.ey.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LoanTest3 {
	
	@Test
	void testGetResult() {
		Loan l=new Loan();
		assertTrue(l.getResult());
	}

	@Test
	void testGetMsg() {
		Loan l=new Loan();
		
		assertNotNull(l.getMsg("Good Monrning"));
		//fail("Not yet implemented");
	}

}
