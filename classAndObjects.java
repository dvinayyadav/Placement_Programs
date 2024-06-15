package PlacementPrograms;

import java.util.Scanner;

public class classAndObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scanner.nextInt();
		}
		int l=scanner.nextInt();
		int r=scanner.nextInt();
		int cnt=0;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if((arr[i]+arr[j]>=l) && (arr[i]+arr[j]<=r) ){
					cnt++;			
				}
			}
		}
		System.out.println(cnt);

	}

}
