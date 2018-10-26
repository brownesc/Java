//Purpose: Table
//Program Name: SBrowne04_02
//Date 10/22
import java.util.Scanner;
public class SBrowne04_02{
   public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		System.out.print("Enter n: ");
		int n = input.nextInt();
		printMatrix(n);
	}
   public static void printMatrix(int n) {
      for (int row = 0; row < n; row++) {
			for (int col = 0; col < n; col ++) {
				// Generate and print randomly 0 or 1
				System.out.print((int)(Math.random()*2));
			}
			System.out.println();
      }
   }
}


        
       
         
