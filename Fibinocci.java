package PlacementPrograms;

import java.util.Scanner;

public class Fibinocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int a=0;
		int b=1;
		int s=2;
		int c=0;
		int n=scanner.nextInt();
		if(n==1) {
			System.out.println(a);
		}
		else if(n==2) {
			System.out.println(b);
		}
		else {
			while(s<=n) {
			   c=a+b;
			   a=b;
			   b=c;
			   s++;
			   }
			System.out.println(c);
		}
		

	}

}
