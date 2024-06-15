package PlacementPrograms;

import java.util.Scanner;
public class Pairs_Sum_DivisibleByTWO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scanner.nextInt();
		}
		
        int cnt=0;
        for(int i=0;i<n;i++) {
        	for(int j=i+1;j<n;j++) {
        		if((arr[i]+arr[j])%2==0) {
        			System.out.println("("+arr[i]+","+arr[j]+")");
        			cnt++;
        		}
        	}
        }
        System.out.println(cnt);
	}

}
