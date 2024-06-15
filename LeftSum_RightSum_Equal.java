package PlacementPrograms;

import java.util.Scanner;

public class LeftSum_RightSum_Equal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scanner.nextInt();
		}
		for(int i=0;i<n;i++) {
			int pre=0,post=0;
			for(int j=i-1;j>=0;j--) {
				pre+=arr[j];
			}
			for(int j=i+1;j<n;j++) {
				post+=arr[j];
			}
			if(pre==post) {
				System.out.println(arr[i]);
			}
		}

	}

}
