package com.hemebiotech.analytics;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

/** create a new file with symptoms in the alphabetic order, without , with numeric values associated */
public class WriteResultFromFile implements ResultFileWriter {
	public void writeFile(Map<String, Integer> SymptomsMap) throws IOException {

		/** create result.out file */
		File result = new File("Project02Eclipse/results.out");

		/** write the content in a new file */
		FileWriter fw = new FileWriter(result.getAbsoluteFile());
		BufferedWriter bw = new BufferedWriter(fw);

		/** TreeMap puts the list in the increasing order */
		TreeMap<String, Integer> sortedSymptoms = new TreeMap<>();
		sortedSymptoms.putAll(SymptomsMap);

		/** displays the content in a new file */
		for (Map.Entry<String, Integer> val : sortedSymptoms.entrySet()) {

			bw.write(val.getKey() + " = " + val.getValue());
			bw.write(System.lineSeparator());
			System.out.println(val.getKey() + " = " + val.getValue());
		}
		bw.flush();
		bw.close();		

	}

}
