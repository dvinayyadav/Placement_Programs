package PlacementPrograms;

import java.util.Scanner;

public class Factorial {
	public static int Factorial(int n) {
		if(n==1) {
			return 1;
		}
		return n*Factorial(n-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.print(Factorial(n));

	}

}
