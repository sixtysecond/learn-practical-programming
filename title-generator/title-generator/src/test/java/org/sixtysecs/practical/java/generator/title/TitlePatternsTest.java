package org.sixtysecs.practical.java.generator.title;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class TitlePatternsTest {

	private final static int repeatCount = 1;

	@Test
	public void getPatternsTest() {
		List<List<PartOfSpeech>> patterns = TitlePatterns.getPatterns();
		assertNotNull(patterns);
		assertTrue(patterns.size() > 0);
		for (List<PartOfSpeech> pattern : patterns) {
			for (int i = 0; i < repeatCount; i++) {
				String title = new TitleGenerator(pattern).generate();
				System.out.println(title);
			}
		}
	}

}
