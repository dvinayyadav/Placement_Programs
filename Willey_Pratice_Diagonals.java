package PlacementPrograms;

import java.util.Scanner;

public class Willey_Pratice_Diagonals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 
1       1		 * 
 2     2 
  3   3  
   4 4   
    5    
   4 4   
  3   3  
 2     2 
1       1
		 */
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int add=n-1;
		for(int i=1;i<n*2;i++) {
			for(int j=1;j<n*2;j++) {
				
				if((i==j || i+j==n*2) && i<=n) {
					System.out.print(i);
				}
				else if((i+j==n*2) && i>n) {
					System.out.print(j);
				}
				else if((i==j && i>n && j>n)){
					System.out.print(add);
					add--;
	
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
