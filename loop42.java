
public class loop42 {

	public static void main(String[] args) {
		for (int i=0; i<100; i++) {
			i++;
			System.out.print(i + " ");
			
		}
		System.out.print("\n");
		
		int ii = 0;
		do {
			ii++;
			ii++;
			System.out.print(ii + " ");
								
		} while (ii<100);
		System.out.print("\n");

		int y = 5;
        	int n = 1;
// top of the diamond
        	while (n < y + 1) {
              	int spaces = 0;
              	while (spaces < y - n) {
                    spaces++;
                    System.out.print(" ");
              	}
              	int j = n;
              	while (j > 0) {
                    j--;
                    System.out.print("* ");
              }
              System.out.println();
              n++;
        }
//bottom part of the diamond
        n = y - 1;
        while (n > 0) {
              int spaces = 0;
              while (spaces < y - n) {
                    spaces++;
                    System.out.print(" ");
              }
              int j = n;
              while (j > 0) {
                    System.out.print("* ");
                    j--;
              }
              System.out.println();
              n--;
        }

}
}
