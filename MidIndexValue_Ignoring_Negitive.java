package PlacementPrograms;

import java.util.ArrayList;
import java.util.Scanner;

public class MidIndexValue_Ignoring_Negitive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		ArrayList<Integer> list=new ArrayList<>();
		int cnt=0;
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			if(arr[i]>=0) {
				list.add(arr[i]);
			}
		}
	 System.out.println(list);
	 System.out.println(list.get((list.size()-1)/2));

	}

}
