package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.Map;

/** interface of WriteResultFromFile */
public interface ResultFileWriter {
	void writeFile(Map<String, Integer> counterResult) throws IOException;

	
}
