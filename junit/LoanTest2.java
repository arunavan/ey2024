package com.ey.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

class LoanTest2 {
	Loan l;

	static int a1;
	static double d1;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		a1=5000;
		d1=25.0;
		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		a1=0;
		d1=0.0;
	}

	@BeforeEach
	void setUp() throws Exception {
		l=new Loan();
	}

	@AfterEach
	void tearDown() throws Exception {
		l=null;
	}
    @RepeatedTest(5)
	@Test
	void testGetEmi() {
		assertEquals(a1,l.getEmi(60000));
		//fail("Not yet implemented");
	}

	@Disabled
	@Test
	void testGetSquare() {
		assertEquals(25.0,l.getSquare(5.0));
		//fail("Not yet implemented");
	}

}
