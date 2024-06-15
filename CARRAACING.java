package PlacementPrograms;

import java.util.Scanner;

public class CARRAACING {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int m=scanner.nextInt();
		int k=scanner.nextInt();
		int s=0;
		int cnt=0;
		if(n>m) {
			System.out.println("Impossible");
		}
		else {
			while(k>=s) {
				k+=n;
				s+=m;
				cnt++;
				
			}
			System.out.println(cnt);
		}
		

	}

}
