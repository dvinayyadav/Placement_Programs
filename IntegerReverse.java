package PlacementPrograms;

import java.security.PublicKey;
import java.util.Scanner;


public class IntegerReverse {
	public static void main(String Args[]) {
   Scanner scanner=new Scanner(System.in);
   int n=scanner.nextInt();
   int m=0;
   while(n>0) {
	   int temp=n%10;
	   m=m*10+temp;
	   n/=10;
   }
   System.out.print(m);
}
}
