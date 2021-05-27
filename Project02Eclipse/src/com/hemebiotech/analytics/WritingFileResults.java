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

		// Créer le fichier s'il n'existe pas
		if (!result.exists()) {
			result.createNewFile();
		}

		FileWriter fw = new FileWriter(result.getAbsoluteFile());
		BufferedWriter bw = new BufferedWriter(fw);

		for (int j = 0; j < tailletableau - 1; j++) {
			// Si 2 cases consécutives du tableau contiennent le même symptôme
			if (symptomes[j].equalsIgnoreCase(symptomes[j + 1])) {
				nbapparitionsymptome++;
				// Si on arrive à l'avant-dernier élément du tableau
				if (j == tailletableau - 2) {
					// Ecrire sur result.out
					bw.write(symptomes[j] + " " + nbapparitionsymptome + "\n");
				}
				// Si 2 cases consécutives du tableau contiennent 2 symptômes différents
			} else {
				// Ecrire sur result.out
				try {
					bw.write(symptomes[j] + " " + nbapparitionsymptome + "\n");
					// Si on arrive à l'avant-dernier élément du tableau
					if (j == tailletableau - 2) {
						bw.write(symptomes[j + 1] + " " + "1" + "\n");
					}
				}
				// Traitement des exceptions
				catch (IOException e) {
					e.printStackTrace();
				}
				// Remise à 1 du nombre d'apparition du symptôme
				nbapparitionsymptome = 1;
			}
		}
		// Fermeture du fichier
		bw.close();
	}

}
