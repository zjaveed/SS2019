package assignment1.db;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import assignment1.app.Igel;

class IgelTest {

	@Test
	void testweight() {
		// create test object
		int s1 = 10, w1 = 500;
		Igel i1 = new Igel(s1,w1);
		
		// parameters
		int weightResult = i1.weight();
		
		// test
		assertEquals(w1, weightResult, "weight() return wrong value");
		
	}

}
