package PlacementPrograms;

import java.util.*;

public class ZeroShouldInLastInArray {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int[] arr=new int[n];
		int[] arr1=new int[n];
		int j=0;
		for(int i=0;i<n;i++) {
			arr[i]=scanner.nextInt();
			if(arr[i]!=0) {
				arr1[j]=arr[i];
				j++;
			}
		}
		System.out.println(Arrays.toString(arr1));

	}

}
