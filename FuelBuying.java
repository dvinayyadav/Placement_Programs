package PlacementPrograms;

import java.util.Scanner;

public class FuelBuying {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int k=scanner.nextInt();
		int[] pri=new int[n];
		int[] qua=new int[n];
		for(int i=0;i<n;i++) {
			pri[i]=scanner.nextInt();
		}
		for(int i=0;i<n;i++) {
			qua[i]=scanner.nextInt();
		}
		int Quantity=0;
		for(int j=n-1;j>=0;j--) {
			if(k>=pri[j]) {
				Quantity+=qua[j];
				k-=pri[j];
			}
			
		}
		System.out.println(Quantity);

	}

}
