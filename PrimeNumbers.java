package PlacementPrograms;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeNumbers {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> arrayList=new ArrayList<>();
		int m=sc.nextInt();
		int n=sc.nextInt();
		for (int i = m; i <n; i++)
		{
		for (int j = 1; j <=i; j++)
		{
		if (i%j==0)
		{
		arrayList.add(i);
		}
		}
		
		}
		for(int i=0;i<arrayList.size();i+=2) {
			System.out.println(arrayList.get(i));
	}
	

}
}