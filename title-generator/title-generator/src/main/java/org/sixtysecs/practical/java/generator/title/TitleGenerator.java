package org.sixtysecs.practical.java.generator.title;

import java.util.List;

public class TitleGenerator {

	private List<PartOfSpeech> partOfSpeechList;

	public TitleGenerator(List<PartOfSpeech> partOfSpeechList) {
		this.partOfSpeechList = partOfSpeechList;
	}

	public String generate() {
		StringBuilder builder = new StringBuilder();

		for (int i = 0; i < partOfSpeechList.size(); i++) {
			PartOfSpeech partOfSpeech = partOfSpeechList.get(i);
			if (i != 0 && partOfSpeech.isSpaceNeededBefore()) {
				builder.append(" ");
			}
			builder.append(partOfSpeech.getRandom());

		}
		return builder.toString();
	}
}
