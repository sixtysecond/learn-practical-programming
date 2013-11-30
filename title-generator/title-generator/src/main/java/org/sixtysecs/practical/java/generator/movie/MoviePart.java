package org.sixtysecs.practical.java.generator.movie;

import java.util.List;
import java.util.Random;

import org.sixtysecs.practical.java.generator.title.FileUtil;

public enum MoviePart {

	ACTOR(FileUtil.listFromFile("src/main/resources/actor.txt")), //
	ACTRESS(FileUtil.listFromFile("src/main/resources/actress.txt")), //
	PERFORMER(FileUtil.listFromFile("src/main/resources/actor.txt",
			"src/main/resources/actress.txt")), //
	DIRECTOR(FileUtil.listFromFile("src/main/resources/director.txt")), //
	TROPE(FileUtil.listFromFile("src/main/resources/trope.txt"));

	private List<String> members;

	private MoviePart(List<String> members) {
		if (members == null || members.size() == 0) {
			throw new IllegalArgumentException("must have 1 or more members");
		}
		this.members = members;
	}

	public List<String> getMembers() {
		return members;
	}

	private final static Random random = new Random();

	public String getRandom() {
		if (members == null || members.size() == 0) {
			return null;
		}
		return members.get(random.nextInt(members.size()));
	}
}