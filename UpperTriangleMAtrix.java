package PlacementPrograms;
import java.util.*;
public class UpperTriangleMAtrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[][] arr=new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=sc.nextInt();
			}

		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i<=j) {
					System.out.print(arr[i][j]+" ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}

}