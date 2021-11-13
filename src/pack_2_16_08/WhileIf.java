package pack_2_16_08;

import java.util.Scanner;

public class WhileIf {

	public static void main(String[] args) {

// ZADATAK: Saberi prvih n=100 brojeva

/*
		 * int n = 10; 
		 * int zbir = 0; 
		 * int iterator = 0;
		 * 
		 * while( iterator < n ) { zbir = zbir + iterator; iterator++; }
		 * 
		 * System.out.println("Zbir je: " + zbir);
*/

/*
		 * int n = 10; 
		 * int zbir = 0; 
		 * int iterator = 0;
		 * 
		 * while( iterator < n ) { zbir = zbir + iterator; iterator++;
		 * 
		 * System.out.println("Zbir je: " + zbir + ", iterator: " + iterator); }
		 * System.out.println("Zbir je: " + zbir);
*/

/*
		 * int n = 0; int zbir = 0; int iterator = 100;
		 * 
		 * while( iterator >= n ) { zbir = zbir + iterator; iterator--;
		 * 
		 * System.out.println("Zbir je: " + zbir + ", iterator: " + iterator); }
		 * System.out.println("Zbir je: " + zbir);
*/

// ZADATAK Ispisi sve parne brojeve do 100.

		/* int parniBroj = 1;
		while (parniBroj < 100) {
			if (parniBroj % 2 == 0) {
				System.out.println(parniBroj);
			}
			parniBroj++; */
		
// ZADATAK: Neparne do 100 koji su deljivi sa 3

		int nBroj = 0;
		while (nBroj < 100) {
			if (nBroj % 2 != 0 && nBroj %3 == 0) {
				System.out.println(nBroj);
			}
			nBroj++;
		}
	}

}
