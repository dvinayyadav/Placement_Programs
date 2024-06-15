package PlacementPrograms;

import java.util.*;

public class PRIMEFIBINOC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<Integer> list=new ArrayList<>();
		for(int j=2;j<=n;j++) {
			if(IsPrime(j)) {
				list.add(j);
				}
		}
		int[] arr=new int[n];
		for(int i=0;i<n-2;i++) {
			arr[i]=list.get(i);
		}
		System.out.println(list);

	}
	public static Boolean IsPrime(int n) {
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}

}
