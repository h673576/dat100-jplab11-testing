package no.hvl.dat100.jplab12.tests;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestPerson {

	@Test
	public void testConstructor() {
		TPerson person = new TPerson("Olsen", "Ole", 6);
		
		assertEquals(person.getEtternamn(),"Olsen");
		assertEquals(person.getFornamn(),"Ole");
		assertEquals(person.getFodselsnummer(),6);
	}

	@Test
	public void testSet() {
		TPerson person = new TPerson();
		
		
		person.setEtternamn("Olsen");
		person.setFornamn("Ole");
		person.setFodselsnummer(6);
		
		assertEquals(person.getEtternamn(),"Olsen");
		assertEquals(person.getFornamn(),"Ole");
		assertEquals(person.getFodselsnummer(),6);
	}
	
	@Test
	public void testKjonn1() {
		TPerson person = new TPerson("Olsen", "Ole", 6);
		
		assertTrue(person.erMann());
		assertFalse(person.erKvinne());
	}
	
	@Test
	public void testKjonn2() {
		TPerson person = new TPerson("Olsen", "Oline", 7);
		
		assertFalse(person.erMann());
		assertTrue(person.erKvinne());
	}
	
	@Test
	public void testerLik() {
		TPerson person1 = new TPerson("Olsen", "Oline", 7);
		TPerson person2 = new TPerson("Olsen", "Oline", 7);
		TPerson person3 = new TPerson("Olsen", "Oline", 8);
		
		assertFalse(person1.erLik(person3));
		assertTrue(person1.erLik(person2));
	}
}
