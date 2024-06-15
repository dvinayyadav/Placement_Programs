package PlacementPrograms;

import java.util.Scanner;

public class GetFair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		String[] arr=new String[n];
		int[] fair=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scanner.next();
		}
		for(int i=0;i<n;i++) {
			fair[i]=scanner.nextInt();
		}
		String start=scanner.next();
		String endString=scanner.next();
		int fairA=0;
		for(int i=0;i<n;i++) {
			int total=0;
			if(start.equals(arr[i])) {
				for(int j=i+1;j<n;j++) {
					if(endString.equals(arr[j])) {
						for(int k=i;k<j;i++) {
							total+=fair[k];
						}
					}
				}
			}
			fairA=total;
		}
		System.out.print(fairA);

	}

}
