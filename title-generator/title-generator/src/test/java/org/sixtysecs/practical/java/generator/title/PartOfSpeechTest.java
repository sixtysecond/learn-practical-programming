package org.sixtysecs.practical.java.generator.title;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class PartOfSpeechTest {

	@Test
	public void adjectiveTest() {
		List<String> list = PartOfSpeech.ADJECTIVE.getMembers();
		assertNotNull(list);
		assertTrue(list.size() > 0);
		assertTrue(list.contains("happy"));
	}

	@Test
	public void adverbTest() {
		List<String> list = PartOfSpeech.ADVERB.getMembers();
		assertNotNull(list);
		assertTrue(list.size() > 0);
		assertTrue(list.contains("how"));
	}

	@Test
	public void conjunctionTest() {
		List<String> list = PartOfSpeech.CONJUNCTION.getMembers();
		assertNotNull(list);
		assertTrue(list.size() > 0);
		assertTrue(list.contains("and"));
	}

	@Test
	public void interjectionTest() {
		List<String> list = PartOfSpeech.INTERJECTION.getMembers();
		assertNotNull(list);
		assertTrue(list.size() > 0);
		assertTrue(list.contains("oh"));
	}

	
	@Test
	public void firstNameTest() {
		List<String> list = PartOfSpeech.FIRST_NAME.getMembers();
		assertNotNull(list);
		assertTrue(list.size() > 0);
		assertTrue(list.contains("David"));
	}

	@Test
	public void surnameTest() {
		List<String> list = PartOfSpeech.LAST_NAME.getMembers();
		assertNotNull(list);
		assertTrue(list.size() > 0);
		assertTrue(list.contains("Abbott"));
	}

	
	@Test
	public void nounTest() {
		List<String> list = PartOfSpeech.NOUN.getMembers();
		assertNotNull(list);
		assertTrue(list.size() > 0);
		assertTrue(list.contains("cat"));
	}

	@Test
	public void number() {
		List<String> list = PartOfSpeech.NUMBER.getMembers();
		assertNotNull(list);
		assertTrue(list.size() > 0);
		assertTrue(list.contains("one"));
	}

	@Test
	public void prepositionTest() {
		List<String> list = PartOfSpeech.PREPOSITION.getMembers();
		assertNotNull(list);
		assertTrue(list.size() > 0);
		assertTrue(list.contains("to"));
	}

	@Test
	public void punctuationTest() {
		List<String> list = PartOfSpeech.PUNCTUATION.getMembers();
		assertNotNull(list);
		assertTrue(list.size() > 0);
		assertTrue(list.contains("."));
	}

	@Test
	public void verbTest() {
		List<String> list = PartOfSpeech.VERB.getMembers();
		assertNotNull(list);
		assertTrue(list.size() > 0);
		assertTrue(list.contains("run"));
	}

}
