package PlacementPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class BusStop_Fairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int[] arr=new int[n];
		String[] arr1=new String[n];
		for(int i=0;i<n;i++){
			arr1[i]=scanner.next();
		}
		for(int i=0;i<n;i++) {
			arr[i]=scanner.nextInt();
		}
		
		int[] Dis=new int[n];
		Dis[0]=arr[0];
		for(int i=1;i<n;i++) {
			Dis[i]=Dis[i-1]+arr[i];
		}
		System.out.println(Arrays.toString(Dis));
		String start=scanner.next();
		String end=scanner.next();
		int distance=Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			if(start.equals(arr1[i]) ){
				for(int j=i+1;j<n;j++) {
					if(end.equals(arr1[j])){
						distance=Dis[j]-Dis[i];
					}
				}
			}
		}
		int fair=0;
		while(distance>=1000) {
			fair+=5;
			distance-=1000;
		}
		if(distance>0 && distance<1000) {
			fair+=5;
		}
		int ans=(int)Math.ceil(fair);
		System.out.println(distance+" "+ans);
	}

}