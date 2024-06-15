package PlacementPrograms;

import java.util.Scanner;

public class CruiseParty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int[] ent=new int[n];
		int[] exit=new int[n];
		for(int i=0;i<n;i++) {
			ent[i]=scanner.nextInt();
		}
		for(int i=0;i<n;i++) {
			exit[i]=scanner.nextInt();
		}
		int max=0;
		int et=0;
		for(int i=0;i<n;i++) {
			et+=ent[i];
			et-=exit[i];
			System.out.println(et);
			if(et>max) {
				max=et;
			}
		}
		System.out.println();
		System.out.println();
		System.out.println(max);


	}

}

