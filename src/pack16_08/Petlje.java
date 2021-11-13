package pack16_08;

import java.util.Scanner;

public class Petlje {

	public static void main(String[] args) {
		/*
		 * WHILE (condition) { code block to be executed }
		 */
		/*
		 * Prvi primer:
		 * 
		 * int i = 0;
		 * 
		 * while(i < 10) { System.out.println("i: " + i); i++; // i = i + 1; }
		 */

		Scanner sc = new Scanner(System.in);

		/*
		 * int unetiBroj = 0; int tajniBroj = 3;
		 * 
		 * while(unetiBroj != tajniBroj) { System.out.println("Uneti tajni broj: ");
		 * unetiBroj = sc.nextInt(); }
		 * 
		 * System.out.println("Pogodili ste."); sc.close();
		 */

		/*	ZADATAK:
		 * Napraviti program sa while petljom koja ispisuje 'Da li zelite da izadjete iz
		 * petlje [d/n]: ' d-da, n -ne Ukoliko izaberemo d, tj. 'da', tada izlazimo iz
		 * petlje Ukoliko izaberemo n, tj. 'ne', tada ostajemo u petlji i ponavljamo
		 * pitanje
		 */

		char da = 'd';
		// char ne = 'n';
		char bravo = ' ';

		while (bravo != da) {
			System.out.println("Da li zellite da izadjete iz petlje?");
			bravo = sc.nextLine().charAt(0);
		}
		System.out.println("Uspesno ste izasli iz petlje.");
		sc.close();
	}

}
