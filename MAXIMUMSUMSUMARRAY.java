package PlacementPrograms;

import java.util.Scanner;

import javax.management.relation.InvalidRoleInfoException;

public class MAXIMUMSUMSUMARRAY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scanner.nextInt();
		}
		int max=0;int i=0;
		int sum=0;
		while(i<n) {
			sum+=arr[i];
		if(sum>max) {
			max=sum;
		}
		if(sum<0) {
			sum=0;
		}
			i++;
			
			
		}
    
		 System.out.println(max);
	}

}
