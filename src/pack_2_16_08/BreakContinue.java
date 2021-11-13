package pack_2_16_08;

public class BreakContinue {

	public static void main(String[] args) {

		/*
		 * int nMax = 10; int broj = 4; int iterator = 0;
		 * 
		 * while( iterator < nMax ) { System.out.println("Iterator: " + iterator);
		 * 
		 * if( iterator == broj ) { System.out.println("Break!"); break; } iterator++; }
		 * System.out.println("Jasno.");
		 */

		int nMax = 10;
		int iterator = 0;

		while (iterator < nMax) {

			iterator++; // U ovom slucaju iterator mora da stoji ovde da petlja ne bi bila beskonacna!

			if (iterator % 2 == 0) {
				System.out.println("	Continue!");
				continue;
			}
			System.out.println("Iterator: " + iterator);

		}
		System.out.println("Jasno.");
	}

}
