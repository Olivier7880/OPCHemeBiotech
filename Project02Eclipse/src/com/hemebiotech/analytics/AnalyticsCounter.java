package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.Arrays;

public class AnalyticsCounter {

	public static void main(String args[]) throws IOException {
		// Partie 1 : Initialisation des variables et constantes, à l'exception du
		// tableau en partie 2
		String filepath = "C:\\Users\\thiba\\git\\Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application\\Project02Eclipse\\Symptoms.txt";
		String resultpath = "C:\\Users\\thiba\\git\\Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application\\Project02Eclipse\\results.out";
		int tailletableau = 0;
		int nblignesfichier = 0;
		int nbapparitionsymptome = 1;

		// Partie 2 : Première lecture du fichier et décompte des lignes pour la taille
		// du tableau
		tailletableau = FirstReadingSymptoms.PremiereLecture(filepath, nblignesfichier);
		String[] symptomes = new String[tailletableau];
		// System.out.println(tailletableau);

		// Partie 3 : Seconde lecture du fichier et remplissage du tableau
		SecondReadingSymptoms.SecondeLecture(filepath, symptomes, tailletableau);

		// Partie 4 : Tri du tableau par ordre alphabétique
		// System.out.println(Arrays.toString(symptomes));
		Arrays.sort(symptomes);
		// System.out.println(Arrays.toString(symptomes));

		// Partie 5 : Comparaison des éléments du tableau et affichage final
		WritingFileResults.EcritureFichierResultat(resultpath, symptomes, tailletableau, nbapparitionsymptome);
	}
}