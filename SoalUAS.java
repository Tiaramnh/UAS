public class SoalUAS {

	public static void main(String[] args) {
		
				int a = 5;
				int b, c;
				for ( b= 0; b <= a ; b++) {
				for (b = 0; b < a ; b++) {
					for (c = a; c > b; c--) {
						System.out.print(" ");
					}
					for (c = 0; c <= b; c++) {
						System.out.print(c);
					}
					System.out.println();
				}
			}
		}
	}