package org.sixtysecs.practical.java.generator.movie;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import java.util.List;
import org.junit.Test;

public class MoviePartTest {
	@Test
	public void actorTest() {
		List<String> list = MoviePart.ACTOR.getMembers();
		assertNotNull(list);
		assertTrue(list.size() > 0);
		assertTrue(list.contains("Brad Pitt"));
	}

	@Test
	public void actressTest() {
		List<String> list = MoviePart.ACTRESS.getMembers();
		assertNotNull(list);
		assertTrue(list.size() > 0);
		assertTrue(list.contains("Kathy Bates"));
	}

	@Test
	public void directorTest() {
		List<String> list = MoviePart.DIRECTOR.getMembers();
		assertNotNull(list);
		assertTrue(list.size() > 0);
		assertTrue(list.contains("Peter Jackson"));
	}

	@Test
	public void performerTest() {
		List<String> list = MoviePart.PERFORMER.getMembers();
		assertNotNull(list);
		assertTrue(list.size() > 0);
		assertTrue(list.contains("Kathy Bates"));
		assertTrue(list.contains("Brad Pitt"));
	}

	@Test
	public void tropeTest() {
		List<String> list = MoviePart.TROPE.getMembers();
		assertNotNull(list);
		assertTrue(list.size() > 0);
		assertTrue(list.contains("Buddy Cop"));
	}
}
