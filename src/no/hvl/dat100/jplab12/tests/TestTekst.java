package no.hvl.dat100.jplab12.tests;

import static org.junit.Assert.*;

import org.junit.Test;
import no.hvl.dat100.jplab12.oppgave2.*;

public class TestTekst {
	
	@Test
	public void testConstructor() {
		Tekst tekst = new Tekst(1,"Ole Olsen", "23-10-2019","en tekst");
		
		assertEquals("Ole Olsen",tekst.getBruker());
		assertEquals(1,tekst.getId());
		assertEquals(0,tekst.getLikes());
		assertEquals("23-10-2019",tekst.getDato());
		assertEquals("en tekst",tekst.getTekst());
	}

	// TODO - also test second constructor
	
	@Test
	public void testSet() {
		Tekst tekst = new Tekst();
		
		tekst.setTekst("en tekst");

		assertEquals("en tekst",tekst.getTekst());

	}
	
	@Test
	public void testToString() {
		Tekst tekst = new Tekst(1,"Ole Olsen", "23-10-2019","en tekst");
		
		String str = "TEKST\n1: Ole Olsen [23-10-2019] 0\nen tekst\n";
		
		assertEquals(str,tekst.toString());
	}
	
}
