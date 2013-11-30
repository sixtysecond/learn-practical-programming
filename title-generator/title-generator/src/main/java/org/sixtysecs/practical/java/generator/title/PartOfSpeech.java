package org.sixtysecs.practical.java.generator.title;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public enum PartOfSpeech {

	// GENERIC PARTS OF SPEECH
	ADJECTIVE(FileUtil.listFromFile("src/main/resources/adjective.txt")), //
	ADVERB(FileUtil.listFromFile("src/main/resources/adverb.txt")), //
	CONJUNCTION(FileUtil.listFromFile("src/main/resources/conjunction.txt")), //
	INTERJECTION(FileUtil.listFromFile("src/main/resources/interjection.txt")), //
	FIRST_NAME(FileUtil.listFromFile("src/main/resources/firstname.txt")), //
	NOUN(FileUtil.listFromFile("src/main/resources/noun.txt")), //
	NUMBER(FileUtil.listFromFile("src/main/resources/number.txt")), //
	PREPOSITION(FileUtil.listFromFile("src/main/resources/preposition.txt")), //
	PRONOUN(FileUtil.listFromFile("src/main/resources/pronoun.txt")), //
	PUNCTUATION(FileUtil.listFromFile("src/main/resources/punctuation.txt")), //
	LAST_NAME(FileUtil.listFromFile("src/main/resources/lastname.txt")), //
	VERB(FileUtil.listFromFile("src/main/resources/verb.txt")), //
	


	// COMMON PUNCTUATION
	COLON(Arrays.asList(":"), false), //
	COMMA(Arrays.asList(","), false), //
	DOUBLE_QUOTE(Arrays.asList("\""), false), //
	PLURAL(Arrays.asList("s"), false), //
	POSSESSIVE(Arrays.asList("'s"), false), //

	// USER-DEFINED lists (can contain 1 or more items)
	A(Arrays.asList("a")), //
	ADVENTURES(Arrays.asList("adventures")), //
	AND(Arrays.asList("and")), //
	COLOR(Arrays.asList("red", "orange", "yellow", "blue", "indigo", "violet")), //
	COOKBOOK(Arrays.asList("cookbook")), //
	GOODNIGHT(Arrays.asList("goodnight")), //
	LITTLE(Arrays.asList("little")), //
	LORD(Arrays.asList("lord")), //
	OF(Arrays.asList("of")), //
	TALE(Arrays.asList("tale")), //
	THE(Arrays.asList("the")), //
	WITH(Arrays.asList("with")), //
	ZOMBIE(Arrays.asList("zombie"));

	private List<String> members;
	private boolean isSpaceNeededBefore;

	private PartOfSpeech(List<String> members) {
		if (members == null || members.size() == 0) {
			throw new IllegalArgumentException("must have 1 or more members");
		}
		this.members = members;
		this.isSpaceNeededBefore = true;
	}

	private PartOfSpeech(List<String> members, boolean needsSpace) {
		if (members == null || members.size() == 0) {
			throw new IllegalArgumentException("must have 1 or more members");
		}
		this.members = members;
		this.isSpaceNeededBefore = needsSpace;
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
	
	public boolean isSpaceNeededBefore() {
		return isSpaceNeededBefore;
	}
}
