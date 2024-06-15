package PlacementPrograms;

import java.util.Scanner;
public class Strong_NUmber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int temp=n,sum=0;
		while(n>0) {
			int m=n%10;
			int fact=factorial(m);
			System.out.println(fact);
			n/=10;
			sum+=fact;
		}
		System.out.println(sum);
		if(sum==temp) {
			System.out.println("Strong Number");
		}
		else {
		System.out.println("Not");	
		}

	}
	static int factorial(int num) {
		if(num==1) {
			return 1;
		}
		return num*factorial(num-1);
	}

}
