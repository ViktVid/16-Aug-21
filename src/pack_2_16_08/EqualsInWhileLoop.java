package pack_2_16_08;

import java.util.Scanner;

public class EqualsInWhileLoop {

	public static void main(String[] args) {

		/*
		 * Scanner e = new Scanner(System.in);
		 * 
		 * String e1 = new String("First"); String e2 = new String("First");
		 * 
		 * System.out.println("e1: " + e1);
		 * 
		 * System.out.println("e2: " + e2);
		 * 
		 * if (e1 == e2) { System.out.println("e1 == e2");
		 * 
		 * }
		 * 
		 * if (e1.equals(e2)) { System.out.println("1. e1 equals e2"); } else {
		 * System.out.println("Not equal!"); }
		 * 
		 * e1 = e2;
		 * 
		 * if (e1 == e2) { System.out.println("e1 == e2");
		 * 
		 * }
		 * 
		 * if (e1 == e2) { System.out.println("2. e1 equals e2"); } else {
		 * System.out.println("Not equal!"); }
		 */
		// Nadji zbir svih brojeva izmedju dva uneta broja

		Scanner e = new Scanner(System.in);

		System.out.println("Unesite neki broj: ");
		int brMin = e.nextInt();
		System.out.println("Unesite drugi broj: ");
		int brMax = e.nextInt();

		if (brMin > brMax) {
			int tmp = brMin;
			brMin = brMax;
			brMax = tmp; // Uvek nam treba neka treca promenljiva za SWITCH(swap)
		}
		int iterator = brMin;
		int zbir = 0;

		while (iterator < brMax) {
			zbir = zbir + iterator;
			System.out.println("Iterator" + iterator + ", zbir: " + zbir);
			iterator++;
		}
		System.out.println("Zbir= " + zbir);
	}
}
