package PlacementPrograms;

import java.util.Scanner;
public class SumOfSmallestAndLargestPrimeInRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int m=scanner.nextInt();
		int i=n;
		int j=m;
	 int sum=0;
		while(i<m) {
			if(Isprime(i)) {
			sum+=i;
			break;
			}
			i++;
		}
		while(j>n) {
			if(Isprime(j)) {
			sum+=j;
			break;
			}
			j--;
		}
		System.out.print(sum);

	}
	static boolean Isprime(int n) {
		if(n<0) {
			n*=(-1);
		}
		for(int i=2;i<n;i++) {
		  if(n%i==0) {
			  return false;
		  }
		}
		return true;
	}

}
