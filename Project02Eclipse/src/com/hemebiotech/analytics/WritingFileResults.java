package com.hemebiotech.analytics;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

// Partie 5 du programme
public class WritingFileResults {
	public static void EcritureFichierResultat(String resultpath, String[] symptomes, int tailletableau,
			int nbapparitionsymptome) throws IOException {
		File result = new File(resultpath);

		// Cr�er le fichier s'il n'existe pas
		if (!result.exists()) {
			result.createNewFile();
		}

		FileWriter fw = new FileWriter(result.getAbsoluteFile());
		BufferedWriter bw = new BufferedWriter(fw);

		for (int j = 0; j < tailletableau - 1; j++) {
			// Si 2 cases cons�cutives du tableau contiennent le m�me sympt�me
			if (symptomes[j].equalsIgnoreCase(symptomes[j + 1])) {
				nbapparitionsymptome++;
				// Si on arrive � l'avant-dernier �l�ment du tableau
				if (j == tailletableau - 2) {
					// Ecrire sur result.out
					bw.write(symptomes[j] + " " + nbapparitionsymptome + "\n");
				}
				// Si 2 cases cons�cutives du tableau contiennent 2 sympt�mes diff�rents
			} else {
				// Ecrire sur result.out
				try {
					bw.write(symptomes[j] + " " + nbapparitionsymptome + "\n");
					// Si on arrive � l'avant-dernier �l�ment du tableau
					if (j == tailletableau - 2) {
						bw.write(symptomes[j + 1] + " " + "1" + "\n");
					}
				}
				// Traitement des exceptions
				catch (IOException e) {
					e.printStackTrace();
				}
				// Remise � 1 du nombre d'apparition du sympt�me
				nbapparitionsymptome = 1;
			}
		}
		// Fermeture du fichier
		bw.close();
	}

}
