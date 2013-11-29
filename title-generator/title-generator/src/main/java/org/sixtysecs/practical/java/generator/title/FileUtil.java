package org.sixtysecs.practical.java.generator.title;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class FileUtil {

	/**
	 * 
	 * @param filePath
	 *            the file to read from
	 * @return a List of String where each line is a member of the list.
	 *         Duplicate entries are treated as a single entry. Empty lines are
	 *         ignored. If the file is empty, an empty list will be returned.
	 */
	public static List<String> listFromFile(String filePath) {
		Set<String> set = new HashSet<String>();
		Scanner s = null;
		try {
			s = new Scanner(new File(filePath));
			while (s.hasNext()) {
				String string = s.next();
				if (!string.isEmpty()) {
					set.add(string);
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (s != null) {
				s.close();
			}
		}
		return new ArrayList<String>(set);
	}

}