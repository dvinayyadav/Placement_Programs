package PlacementPrograms;

import java.util.Scanner;

public class KhoKho {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scanner.nextInt();
		}
		int cnt=0;
		int num=arr[0];
		for(int i=0;i<n;i++) {
			if(arr[i]!=num) {
				cnt++;
			}
		}
		System.out.print(cnt);

	}

}
