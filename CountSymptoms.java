package com.hemebiotech.analytics;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * count the number of each symptom
 * returns a string that is associated with an int
 */
public class CountSymptoms implements SymptomsCounter {
	public Map<String, Integer> count(List<String> symptoms) {

		/** store symptoms with numeric values */
		Map<String, Integer> counter = new HashMap<String, Integer>();

		for (String i : symptoms) { 

			Integer j = counter.get(i); 
			counter.put(i, (j == null) ? 1 : j + 1); 

		} 

		/** put the number of symptoms in the map */
		for (Map.Entry<String, Integer> val : counter.entrySet()) {

			System.out.println(val.getKey() + " = " + val.getValue()); 


		}
		return counter;
	}
}
