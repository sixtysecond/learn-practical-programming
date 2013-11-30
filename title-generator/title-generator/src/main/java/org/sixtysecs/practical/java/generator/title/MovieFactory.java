package org.sixtysecs.practical.java.generator.title;

import java.util.Map;
import java.util.TreeMap;

import org.sixtysecs.practical.java.generator.movie.MoviePart;

public class MovieFactory {
	private MoviePart lead1;
	private MoviePart lead2;
	private MoviePart trope;
	private MoviePart director;
	private final String plot = "?";
	private final String plotTwist = "?";
	
	private MovieFactory (MoviePart lead1, MoviePart lead2, MoviePart trope, MoviePart director){
		this.lead1 = lead1;
		this.lead2 = lead2;
		this.trope = trope;
		this.director = director;
	}
	
	public static MovieFactory anyTwoPerformers() {
		return new MovieFactory(MoviePart.PERFORMER, MoviePart.PERFORMER,
				MoviePart.TROPE, MoviePart.DIRECTOR);
	}
	
	public static MovieFactory maleFemale() {
		return new MovieFactory(MoviePart.ACTOR, MoviePart.ACTRESS,
				MoviePart.TROPE, MoviePart.DIRECTOR);
	}
	
	public static MovieFactory maleMale() {
		return new MovieFactory(MoviePart.ACTOR, MoviePart.ACTOR,
				MoviePart.TROPE, MoviePart.DIRECTOR);
	}
	
	public static MovieFactory femaleFemale() {
		return new MovieFactory(MoviePart.ACTRESS, MoviePart.ACTRESS,
				MoviePart.TROPE, MoviePart.DIRECTOR);
	}
	
	public Map<String,String> generate() {
		Map<String,String> movie = new TreeMap<String,String>();
		movie.put("director",director.getRandom());
		movie.put("lead1",lead1.getRandom());
		movie.put("lead2",lead2.getRandom());
		movie.put("trope",trope.getRandom());
		movie.put("plot", plot);
		movie.put("twist", plotTwist);
		return movie;
	}
}
