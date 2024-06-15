package PlacementPrograms;

import java.util.Scanner;


public class ConsecutiveOnes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int max=Integer.MIN_VALUE;
        int cnt=1;
		for(int i=0;i<n-1;i++) {		
			if(arr[i]==arr[i+1]) {
				cnt++;
				max=Math.max(max,cnt);
			}
			else {
				cnt=1;	
			}
		}
		System.out.println(max);
	}

}
