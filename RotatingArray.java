package PlacementPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class RotatingArray {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scanner.nextInt();
		}
		int k=scanner.nextInt();
		for(int i=0;i<k;i++) {
		   int last=arr[n-1];
		   for(int j=n-1;j>=1;j--) {
			   arr[j]=arr[j-1];
		   }
		   arr[0]=last;
		}
		
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}

}
