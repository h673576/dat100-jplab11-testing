package no.hvl.dat100.jplab12.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import no.hvl.dat100.jplab12.oppgave2.*;

public class TestBilde {
	

	@Test
	public void testConstructor() {
		Bilde bilde = new Bilde(1,"Ole Olsen", "23-10-2019","http://www.picture.com/oo.jpg");
		
		assertEquals("Ole Olsen",bilde.getBruker());
		assertEquals(1, bilde.getId());
		assertEquals("23-10-2019",bilde.getDato());
		assertEquals(0, bilde.getLikes());
		assertEquals("http://www.picture.com/oo.jpg",bilde.getUrl());
	}

	@Test
	public void testSet() {
		Bilde bilde = new Bilde();
		
		bilde.setUrl("http://www.picture.com/oo.jpg");
		
		assertEquals("http://www.picture.com/oo.jpg",bilde.getUrl());
	}

	@Test
	public void testToString() {
		Bilde bilde = new Bilde(1,"Ole Olsen", "23-10-2019","http://www.picture.com/oo.jpg");
		
		String str = "BILDE\n1: Ole Olsen [23-10-2019] 0\nhttp://www.picture.com/oo.jpg\n";;
		
		assertEquals(str,bilde.toString(),str);
	}
}
