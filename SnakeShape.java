package PlacementPrograms;

import java.util.Scanner;

public class SnakeShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int m=scanner.nextInt();
		int n=scanner.nextInt();
		int[][] arr=new int[m][n];
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=scanner.nextInt();
			}
		}
		for(int i=0;i<m;i++) {
			if(i%2==1) {
				for(int j=n-1;j>=0;j--) {
					System.out.print(arr[i][j]+" ");
				}
			}
			else {
				for(int j=0;j<n;j++) {
					System.out.print(arr[i][j]+" ");
				}
			}
		}
	}

}
