package PlacementPrograms;

import java.util.Scanner;


public class HorseBetting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int k=scanner.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scanner.nextInt();
		}
		int max=Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			int cnt=0;
			int sum=0;
			int j=i;
			while(sum<k && j<n) {
				sum+=arr[j];
				j++;
				cnt++;
			}
			System.out.print(cnt-1+" ");
			if(cnt>max) {
				max=cnt;
			}
		}
		System.out.print(max-1);

	}

}
