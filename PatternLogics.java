package PlacementPrograms;

import java.util.Scanner;
public class PatternLogics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=n;j>i;j--) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=1
				
				;i<n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(int j=n-i;j>=1;j--) {
				System.out.print("* ");
			}
			
			System.out.println();
	}

}
}
