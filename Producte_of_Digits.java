package PlacementPrograms;

import java.util.Scanner;

public class Producte_of_Digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		System.out.println(productOfDigitsEqulsToNumber(n));

	}
	static int productOfDigitsEqulsToNumber(int n) {
		int product=1;
		while(n>0) {
			product*=(n%10);
			n/=10;
		}
		return product;
	}

}
