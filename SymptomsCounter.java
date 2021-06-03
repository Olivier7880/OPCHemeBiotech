package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

/** interface of CountSymptoms */
public interface SymptomsCounter {
	Map<String, Integer> count(List<String>symptoms); 
}
