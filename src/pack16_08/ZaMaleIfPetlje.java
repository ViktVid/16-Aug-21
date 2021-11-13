package pack16_08;

public class ZaMaleIfPetlje {

	public static void main(String[] args) {
		
		int bodovi = 3;
		int bodoviZaProlaz = 6;
		String rezultat;
		
		if( bodovi > bodoviZaProlaz) {
			rezultat = "Prosao";
		} else {
			rezultat = "Pao";
		}
		System.out.println("Rezultat: " + rezultat);

// 			Nacin 2:	String ocena = (uslov) ? rez1 : rez2 ;
		
		String ocena = bodovi > bodoviZaProlaz ? "Prosao" : "Pao" ;	
		System.out.println("Ocena: " + ocena);
		
	}

}
