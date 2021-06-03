package com.hemebiotech.analytics;

import java.util.List;

/** interface of ReadSymptomsFromFile */
public interface SymptomsFileReader {
	List<String> readFile(String file);
}
