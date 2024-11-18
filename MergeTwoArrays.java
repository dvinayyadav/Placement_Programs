package PlacementPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class MergeTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int m=scanner.nextInt();
		int[] arr=new int[n];
		int[] arr1=new int[m];
		int[] mergedArray=new int[m+n];
		for(int i=0;i<n;i++) {
			arr[i]=scanner.nextInt();
		}
		for(int i=0;i<m;i++) {
			arr1[i]=scanner.nextInt();
		}
		 System.arraycopy(arr,0,mergedArray,0,n);
		 System.arraycopy(arr1,0,mergedArray,n,m);
		 System.out.println(Arrays.toString(mergedArray));

	}

}
