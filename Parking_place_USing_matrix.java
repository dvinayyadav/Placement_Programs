package PlacementPrograms;

import java.util.Scanner;
public class Parking_place_USing_matrix {

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
           int max=Integer.MIN_VALUE;
           int ans=0;
           for(int i=0;i<m;i++) {
        	   int cnt=0;
        	   for(int j=0;j<n;j++) {
        		   if(arr[i][j]==1) {
        			   cnt++;
        		   }
        	   }
        	   if(cnt>max) {
        		   max=cnt;
        		   ans=i;
        	   }
           }
           System.out.println(ans+1);
	}

}
