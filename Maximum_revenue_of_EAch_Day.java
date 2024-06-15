package PlacementPrograms;

import java.util.Scanner;

public class Maximum_revenue_of_EAch_Day {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int m=scanner.nextInt();
		int[][] arr=new int[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				arr[i][j]=scanner.nextInt();
			}
		}
		for(int i=0;i<n;i++) {
			int r=Integer.MIN_VALUE;
			for(int j=0;j<m;j++) {
				r=Math.max(r, arr[i][j]);
			}
			System.out.print(r+" ");
		}

	}

}
