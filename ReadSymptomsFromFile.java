package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/** read symptoms.txt and store the content */
public class ReadSymptomsFromFile implements SymptomsFileReader {
	public List<String> readFile(String file) {

		List<String> symptoms = new ArrayList<>();

		try {
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String line = null;

			while ((line = reader.readLine()) != null) {
				symptoms.add(line);
			}
			/** close the file */
			reader.close();
		}
		/** catching exceptions */
		catch (IOException e) {
			e.printStackTrace();
		}

		return symptoms;
	}

}
