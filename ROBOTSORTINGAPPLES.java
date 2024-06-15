package PlacementPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ROBOTSORTINGAPPLES {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int[] arr=new int[n];
		int[] col=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scanner.nextInt();
		}
		int r=0,b=0;
		for(int i=0;i<n;i++) {
			col[i]=scanner.nextInt();
			if(col[i]==1) {
				r++;
			}
			else {
				b++;
			}
		}
		if(r!=b) {
			System.out.println("NO");
		}
		else {
			ArrayList<Integer>  rlistArrayList=new ArrayList<>();
			ArrayList<Integer>  blistArrayList=new ArrayList<>();
			for(int i=0;i<n;i++) {
				if(col[i]==1) {
					rlistArrayList.add(arr[i]);
				}
				else {
					blistArrayList.add(arr[i]);
				}
			}
			Collections.sort(rlistArrayList);
			Collections.sort(blistArrayList);
			int k=0;
			int[] sorting=new int[n];
			for(int i=0;i<n;i+=2) {
				sorting[i]=blistArrayList.get(k);
				sorting[i+1]=rlistArrayList.get(k);
				k++;
				
			}
			System.out.println(Arrays.toString(sorting));
		}

	}

}
