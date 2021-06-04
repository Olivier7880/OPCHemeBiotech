package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

/** main method that starts the program */

public class AnalyticsCounter {

	public static void main(String args[]) throws Exception {
		
		/** string for the path of symptoms.txt */
		String file = "symptoms.txt";

		/** CLASS SymptomsFileReader : read the symptoms file and put it in a list */
		SymptomsFileReader reader = new ReadSymptomsFromFile();
		List<String> symptoms = reader.readFile(file);

		/** CLASS SymptomsCounter : count each symptom and put it in alphabetic order */
		SymptomsCounter count = new CountSymptoms();
		Map<String, Integer> counterResult = count.count(symptoms);

		/** CLASS ResultFileWriter : create a new file, put the Map inside and in the alphabetic order */
		ResultFileWriter writer = new WriteResultFromFile();
		writer.writeFile(counterResult);

	}
}
