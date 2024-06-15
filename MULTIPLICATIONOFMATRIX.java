package PlacementPrograms;

import java.util.Scanner;

public class MULTIPLICATIONOFMATRIX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int m1=sc.nextInt();
        int[][] arr1=new int[n1][m1];
        for(int i=0;i<n1;i++){
            for(int j=0;j<m1;j++){
                arr1[i][j]=sc.nextInt();
                
            }
        }
        int n2=sc.nextInt();
        int m2=sc.nextInt();
         int[][] arr=new int[n2][m2];
        for(int i=0;i<n2;i++){
            for(int j=0;j<m2;j++){
                arr[i][j]=sc.nextInt();
                
            }
        }
       if(n1==m2) {
    	   int[][] ans=new int[n1][m2];
    	   for(int i=0;i<n1;i++) {
    		   for(int j=0;j<m2;j++) {
    			   int num=0;
    			   for(int k=0;k<m1;k++) {
    				   num+=arr1[i][k]*arr[k][j];
    			   }
    			   ans[i][j]=num;
    			   System.out.print(ans[i][j]+" ");
    		   }
    		   System.out.println();
    	   }
       }

	}

}
