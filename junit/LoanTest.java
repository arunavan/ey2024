package com.ey.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LoanTest {

	@Test
	void testGetEmi() {
		//expected , actual
		Loan l=new Loan();
		assertEquals(5000,l.getEmi(60000));
		//fail("Not yet implemented");
	}
	
	@Test 
	public void testGetEmi1(){
		Loan l=new Loan();
		assertEquals(9000,l.getEmi(60000));
	}

}
