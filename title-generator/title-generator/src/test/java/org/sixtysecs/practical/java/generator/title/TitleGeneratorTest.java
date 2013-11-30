package org.sixtysecs.practical.java.generator.title;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class TitleGeneratorTest {

	final static int generateCount = 10;

	@Test
	public void generateTest() {
		List<PartOfSpeech> list = new ArrayList<PartOfSpeech>();
		list.add(PartOfSpeech.NOUN);
		list.add(PartOfSpeech.COLON);
		list.add(PartOfSpeech.THE);
		list.add(PartOfSpeech.ADJECTIVE);
		list.add(PartOfSpeech.NOUN);

		for (int i = 0; i < generateCount; i++) {
			String title = new TitleGenerator(list).generate();
			System.out.println(title);
		}
	}

	@Test
	public void spacesBeforeNotFirstWordsTest() {
		List<PartOfSpeech> list = new ArrayList<PartOfSpeech>();
		list.add(PartOfSpeech.THE);
		list.add(PartOfSpeech.TALE);
		String title = new TitleGenerator(list).generate();
		assertEquals("the tale", title);
	}

	@Test
	public void possessiveNoSpaceTest() {
		List<PartOfSpeech> list = new ArrayList<PartOfSpeech>();
		list.add(PartOfSpeech.THE);
		list.add(PartOfSpeech.POSSESSIVE);
		list.add(PartOfSpeech.TALE);
		String title = new TitleGenerator(list).generate();
		assertEquals("the's tale", title);
	}

}
