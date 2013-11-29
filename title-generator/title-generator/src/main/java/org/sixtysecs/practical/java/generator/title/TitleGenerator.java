package org.sixtysecs.practical.java.generator.title;

import java.util.List;

public class TitleGenerator {

	private List<PartOfSpeech> partOfSpeechList;

	public TitleGenerator(List<PartOfSpeech> partOfSpeechList) {
		this.partOfSpeechList = partOfSpeechList;
	}

	public String generate() {
		StringBuilder builder = new StringBuilder();
		for (PartOfSpeech partOfSpeech : partOfSpeechList) {
			if (partOfSpeech.isSpaceNeededBefore()) {
				builder.append(" ");
			}
			builder.append(partOfSpeech.getRandom());

		}
		return builder.toString();
	}
}
