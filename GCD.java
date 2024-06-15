package PlacementPrograms;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scanner=new Scanner(System.in);
    int n=scanner.nextInt();
    int m=scanner.nextInt();
    int min=Math.min(n, m);
    int gcd=Integer.MIN_VALUE;
    for(int i=1;i<min;i++) {
    	if(n%i==0 && m%i==0) {
    		gcd=Math.max(gcd, i);
    	}
    }
    System.out.println(gcd);
	}

}
