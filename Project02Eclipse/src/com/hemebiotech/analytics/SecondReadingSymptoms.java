package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// Partie 3 du programme
public class SecondReadingSymptoms {
	public static String[] SecondeLecture(String filepath, String[] symptomes, int tailletableau) {
		try {
			BufferedReader reader = new BufferedReader(new FileReader(filepath));

			for (int i = 0; i < tailletableau; i++) {
				String line = reader.readLine();
				symptomes[i] = line;
			}
			// Fermeture du fichier
			reader.close();
		}
		// Traitement des exceptions
		catch (IOException e) {
			e.printStackTrace();
		}

		return symptomes;
	}

}
