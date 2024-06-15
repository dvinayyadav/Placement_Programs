package PlacementPrograms;

import java.util.*;

public class NCPI_Coding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int tem=0;
		while(n>0) {
			tem+=n%10;
			n/=10;
		}
		System.out.println(tem);
		System.out.print(IsPrime(tem));
	}
    static String IsPrime(int n) {
    	String anString="Googly";
    	for(int i=2;i<n-1;i++) {
    		if(n%i==0) {
    			anString="Not Googly";
    		}
    	}
    	return anString;
    }
}
