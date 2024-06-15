package PlacementPrograms;

import java.util.*;
public class primePairsInRange {
	public static boolean IsPrime(int n) {
		for(int i=2;i<n-1;i++) {
			if(n%i==0) {
				return false;
				
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		ArrayList<Integer> list=new ArrayList<>();
		for(int i=n+1;i<m;i++) {
			if(IsPrime(i)) {
				list.add(i);
			}
		}
		for(int i:list) {
			System.out.println(i+" ");
		}
		int k=sc.nextInt();
		int cnt=0;
		for(int i=0;i<list.size();i++) {
			for(int j=i+1;j<list.size();j++) {
				if(list.get(j)-list.get(i)==k) {
					System.out.println(list.get(i)+" "+list.get(j));
					cnt++;
				}
			}
		}
		
      System.out.println(cnt);
	}

}
