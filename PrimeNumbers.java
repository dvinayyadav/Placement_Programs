package PlacementPrograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeNumbers {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> arrayList=new ArrayList<>();
		int m=sc.nextInt();
		int n=sc.nextInt();
		for (int i = m; i <n; i++)
		{
		if (isPrime(i)) {
			System.out.println(i);
		}
		
		}
		
	

}
	public static boolean isPrime(int n) {
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
}