package PlacementPrograms;

import java.util.Scanner;

class GreaterThanPrevious{
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int n=scanner.nextInt();
			int[] arr=new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=scanner.nextInt();
			}
			int cnt=0;
			for(int i=1;i<n;i++) {
				if(arr[i]>arr[i-1]) {
					cnt++;
				}
			}
			System.out.print(cnt);
		}
	}
}