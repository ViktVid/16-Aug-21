package pack16_08;

public class PlusPrePlusPosle {

	public static void main(String[] args) {
		
		int x = 4, y = 4;
		int x1 = x++;
//		 x1 = x
// 		 x = x + 1
		
		int y1 = ++y;
// 		 y = y + 1
//		 y1 = y
		
		System.out.println("x: " + x);
		System.out.println("x1: " + x1);
		
		System.out.println("y: " + y);
		System.out.println("y: " + y1);

// 		x++ --->  x = x +1
// Najpre ce x1 poprimiti vrednost intedzera x, a onda tek x poprima +1
	}

}
