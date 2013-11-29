package org.sixtysecs.practical.java.generator.title;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TitlePatterns {

	private static final List<List<PartOfSpeech>> patterns;

	public static List<List<PartOfSpeech>> getPatterns() {
		return patterns;
	}

	static {

		List<List<PartOfSpeech>> tempPatterns = new ArrayList<List<PartOfSpeech>>();

		{
			List<PartOfSpeech> list = new ArrayList<PartOfSpeech>();
			list.add(PartOfSpeech.A);
			list.add(PartOfSpeech.TALE);
			list.add(PartOfSpeech.OF);
			list.add(PartOfSpeech.NUMBER);
			list.add(PartOfSpeech.NOUN);
			list.add(PartOfSpeech.PLURAL);
			tempPatterns.add(Collections.unmodifiableList(list));
		}

		{
			List<PartOfSpeech> list = new ArrayList<PartOfSpeech>();
			list.add(PartOfSpeech.THE);
			list.add(PartOfSpeech.LORD);
			list.add(PartOfSpeech.OF);
			list.add(PartOfSpeech.THE);
			list.add(PartOfSpeech.NOUN);
			tempPatterns.add(Collections.unmodifiableList(list));
		}

		{
			List<PartOfSpeech> list = new ArrayList<PartOfSpeech>();
			list.add(PartOfSpeech.THE);
			list.add(PartOfSpeech.LITTLE);
			list.add(PartOfSpeech.NOUN);
			tempPatterns.add(Collections.unmodifiableList(list));
		}

		{
			List<PartOfSpeech> list = new ArrayList<PartOfSpeech>();
			list.add(PartOfSpeech.THE);
			list.add(PartOfSpeech.NOUN);
			list.add(PartOfSpeech.PREPOSITION);
			list.add(PartOfSpeech.THE);
			list.add(PartOfSpeech.NOUN);
			tempPatterns.add(Collections.unmodifiableList(list));
		}

		{
			List<PartOfSpeech> list = new ArrayList<PartOfSpeech>();
			list.add(PartOfSpeech.THE);
			list.add(PartOfSpeech.NOUN);
			list.add(PartOfSpeech.COMMA);
			list.add(PartOfSpeech.THE);
			list.add(PartOfSpeech.NOUN);
			list.add(PartOfSpeech.COMMA);
			list.add(PartOfSpeech.AND);
			list.add(PartOfSpeech.THE);
			list.add(PartOfSpeech.NOUN);
			tempPatterns.add(Collections.unmodifiableList(list));
		}

		{
			List<PartOfSpeech> list = new ArrayList<PartOfSpeech>();
			list.add(PartOfSpeech.THE);
			list.add(PartOfSpeech.NOUN);
			tempPatterns.add(Collections.unmodifiableList(list));
		}
		
		{
			List<PartOfSpeech> list = new ArrayList<PartOfSpeech>();
			list.add(PartOfSpeech.FIRST_NAME);
			list.add(PartOfSpeech.OF);
			list.add(PartOfSpeech.COLOR);
			list.add(PartOfSpeech.NOUN);
			tempPatterns.add(Collections.unmodifiableList(list));
		}
		
		{
			List<PartOfSpeech> list = new ArrayList<PartOfSpeech>();
			list.add(PartOfSpeech.COLOR);
			list.add(PartOfSpeech.ADJECTIVE);
			tempPatterns.add(Collections.unmodifiableList(list));
		}
		
		{
			List<PartOfSpeech> list = new ArrayList<PartOfSpeech>();
			list.add(PartOfSpeech.FIRST_NAME);
			list.add(PartOfSpeech.POSSESSIVE);
			list.add(PartOfSpeech.NOUN);
			tempPatterns.add(Collections.unmodifiableList(list));
		}
		
		{
			List<PartOfSpeech> list = new ArrayList<PartOfSpeech>();
			list.add(PartOfSpeech.FIRST_NAME);
			list.add(PartOfSpeech.LAST_NAME);
			list.add(PartOfSpeech.AND);
			list.add(PartOfSpeech.THE);
			list.add(PartOfSpeech.NOUN);
			list.add(PartOfSpeech.POSSESSIVE);
			list.add(PartOfSpeech.NOUN);
			tempPatterns.add(Collections.unmodifiableList(list));
		}
		

		{
			List<PartOfSpeech> list = new ArrayList<PartOfSpeech>();
			list.add(PartOfSpeech.VERB);
			list.add(PartOfSpeech.WITH);
			list.add(PartOfSpeech.THE);
			list.add(PartOfSpeech.NOUN);
			tempPatterns.add(Collections.unmodifiableList(list));
		}
		
		{
			List<PartOfSpeech> list = new ArrayList<PartOfSpeech>();
			list.add(PartOfSpeech.GOODNIGHT);
			list.add(PartOfSpeech.NOUN);
			tempPatterns.add(Collections.unmodifiableList(list));
		}
		
		{
			List<PartOfSpeech> list = new ArrayList<PartOfSpeech>();
			list.add(PartOfSpeech.THE);
			list.add(PartOfSpeech.NOUN);
			list.add(PartOfSpeech.COOKBOOK);
			tempPatterns.add(Collections.unmodifiableList(list));
		}
		
		{
			List<PartOfSpeech> list = new ArrayList<PartOfSpeech>();
			list.add(PartOfSpeech.THE);
			list.add(PartOfSpeech.ADVENTURES);
			list.add(PartOfSpeech.OF);
			list.add(PartOfSpeech.ADJECTIVE);
			list.add(PartOfSpeech.LAST_NAME);
			tempPatterns.add(Collections.unmodifiableList(list));
		}

		
		

		patterns = Collections.unmodifiableList(tempPatterns);
	}
}
