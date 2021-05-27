package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// Partie 2 du programme
public class FirstReadingSymptoms {
	public static int PremiereLecture(String filepath, int nblignesfichier) {
		try {
			BufferedReader reader = new BufferedReader(new FileReader(filepath));
			String line = reader.readLine();

			while (line != null) {
				line = reader.readLine();
				nblignesfichier++;
			}
			// Fermeture du fichier
			reader.close();
		}
		// Traitement des exceptions
		catch (IOException e) {
			e.printStackTrace();
		}

		return nblignesfichier;
	}

}
