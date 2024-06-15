package PlacementPrograms;

import java.util.Scanner;

public class SpiralMAtrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int m=scanner.nextInt();
		int[][] mat=new int[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				mat[i][j]=scanner.nextInt();
			}
		}
		int i=0,j=0;
       while(i<n && j<m) {
    	   for(int k=j;k<m;k++) {
    		   System.out.print(mat[i][k]+" ");
    	   }
    	   i++;
    	   for(int k=i;k<n;k++) {
    		   System.out.print(mat[k][m-1]+" ");
    	   }
    	   m--;
    	   if(i<n) {
    		   for(int k=m-1;k>=j;k--)
    		   System.out.print(mat[n-1][k]+" " );
    	   }
    	   n--;
    	   }
       if(j<m) {
    	   for(int k=n-1;k>=i;k--) {
    		   System.out.print(mat[j][k]);
    	   }
    	   j++;
       }
       
	}

}
