package PlacementPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrangingEleemtsInarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int m=scanner.nextInt();
		int[] arr=new int[n];
		int[] arr1=new int[m];
		for(int i=0;i<n;i++) {
			arr[i]=scanner.nextInt();
		}
		for(int i=0;i<m;i++) {
			arr1[i]=scanner.nextInt();
		}
		int[] ans=new int[n];
		ArrayList<Integer> list=new ArrayList<>();
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				if(arr1[i]==arr[j]) {
					list.add(arr[j]);
					arr[j]=0;
				}
			}
		}
		Arrays.sort(arr);
		for(int i=0;i<n;i++) {
			if(arr[i]!=0) {
				list.add(arr[i]);
			}
		}
		
		System.out.println(Arrays.toString(arr));
       System.out.println(list);
      
       
	}
	

}
