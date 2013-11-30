package org.sixtysecs.practical.java.generator.movie;

import static org.junit.Assert.assertNotNull;

import java.util.Map;

import org.junit.Test;
import org.sixtysecs.practical.java.generator.title.MovieFactory;

public class MovieFactoryTest {

	private final static int repeatCount = 3;

	@Test
	public void movieFactoryTest() {

		MovieFactory movieFactory = MovieFactory.anyTwoPerformers();

		for (int i = 0; i < repeatCount; i++) {
			Map<String, String> movie = movieFactory.generate();
			assertNotNull(movie.get("lead1"));
			assertNotNull(movie.get("lead2"));
			assertNotNull(movie.get("trope"));
			assertNotNull(movie.get("director"));
			assertNotNull(movie.get("plot"));
			assertNotNull(movie.get("twist"));
			String pitch = movie.toString().replaceAll(",",
					System.getProperty("line.separator"));
			System.out.println(pitch);
			System.out.println();
		}
	}
}
