package PlacementPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class MexMAximum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scanner.nextInt();
		}
		Arrays.sort(arr);
		int ans=0;
		for(int i=n-1;i>0;i--) {
			if((i+1)!=arr[i]) {
				ans=i+1;
				break;
			}
		}
System.out.println(ans);
	}

}
