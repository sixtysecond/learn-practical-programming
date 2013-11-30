package org.sixtysecs.practical.java.generator.title;

import java.util.List;

import org.sixtysecs.practical.java.generator.movie.MoviePart;

public class TropeGenerator {

	private List<MoviePart> MoviePartList;

	public TropeGenerator(List<MoviePart> MoviePartList) {
		this.MoviePartList = MoviePartList;
	}

	public String generate() {
		StringBuilder builder = new StringBuilder();

		for (int i = 0; i < MoviePartList.size(); i++) {
			MoviePart MoviePart = MoviePartList.get(i);
			if (i != 0 ) {
				builder.append(" ");
			}
			builder.append(MoviePart.getRandom());

		}
		return builder.toString();
	}
}
