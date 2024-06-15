package PlacementPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PrintingFIBINOCCIOPRIME {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		ArrayList<Integer> list=new ArrayList<>();
		int[] arr=new int[n];
		for(int i=2;i<n;i++) {
			if(IsPrime(i)) {
				for(int j=1;j<n;j+=2) {
					arr[j]=i;
				}
			}
		}
		
		
		arr[0]=1;
		arr[2]=1;
		for(int i=4;i<=n;i++) {
			if(i%2!=0) {
				arr[i-1]=arr[i-3]+arr[i-5];
			}
		}
		System.out.println(Arrays.toString(arr));

	}
	static Boolean IsPrime(int n) {
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}

}
