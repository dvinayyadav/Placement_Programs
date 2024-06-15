package PlacementPrograms;

import java.util.Scanner;
public class SprialMatrix {

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
		int i=0,j=0;
		while(i<m && j<n) {
			for(int k=j;k<n;k++) {
				System.out.print(arr[i][k]+" ");
			}
			i++;
			for(int k=i;k<m;k++) {
				System.out.print(arr[k][n-1]+" ");
			}
			n--;
			if(i<m) {
				for(int k=n-1;k>=j;k--) {
					System.out.print(arr[m-1][k]+" ");
				}
				m--;
			}
			if(j<n) {
				for(int k=m-1;k>=i;k--) {
					System.out.print(arr[k][j]+" ");
				}
				j++;
			}
		}
	}

}
 