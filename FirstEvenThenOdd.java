package PlacementPrograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FirstEvenThenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<Integer> list=new ArrayList<>();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			if(arr[i]%2==0) {
				list.add(arr[i]);
			}
		}
		for(int i:arr) {
			if(i%2==1) {
				list.add(i);
			}
		}
		System.out.println(list);

	}

}
