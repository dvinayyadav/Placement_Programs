package PlacementPrograms;

import java.util.Scanner;

public class PushingZerosInTheLast {

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
    	  {
    		   if(arr[i]==0) {
    			   cnt++;
    			  for(int j=i+1;j<n;j++) {
    				  arr[j-1]=arr[j];
    			  }
    		   }
    	   }
       }
       for(int i=n-1;i>n-cnt-1;i--) {
    	   arr[i]=0;
       }
       for(int i:arr) {
       System.out.print(i+" ");
       }	}

}
