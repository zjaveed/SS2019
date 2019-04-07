package test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import source.DBFeldFix;
import source.Igel;

class DBFeldFixTest {

	@Test
	void testGet() {
		DBFeldFix a = new DBFeldFix(3);
		Igel o = new Igel(10,11);
		Igel s = new Igel(11,12);
		a.appendLast(o);
		a.appendLast(s);
		
		assertEquals(o, a.get(1));
		
		
	}
	
	void testAppendLAst() {
		
		DBFeldFix a = new DBFeldFix(3);
		Igel o = new Igel(10,11);
		Igel s = new Igel(11,12);
		a.appendLast(o);
		
		ass
		
	}

}
