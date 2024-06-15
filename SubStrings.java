package PlacementPrograms;

import java.util.Scanner;
public class SubStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scanner.nextInt();
		}
		int cnt=0;
		int tar=scanner.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(Math.abs(arr[i]-arr[j])==tar) {
					cnt++;
				}
			}
		}
		System.out.println(cnt);
		}
		

}
