package PlacementPrograms;

import java.util.Scanner;

public class TrailingZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int fact=1;
		for(int i=2;i<=n;i++) {
			fact*=i;
		}
		int ans=0;
		while(fact%10==0) {
			ans++;
			fact/=10;
		
		}
		System.out.println(ans);
	}
	

}
