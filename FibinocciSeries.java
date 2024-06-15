package PlacementPrograms;

import java.util.Scanner;

public class FibinocciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int i=1,j=1;
		for(int s=0;s<n-2;s++) {
			int z=i+j;
			if(s==n-3)
			System.out.print(z);
			i=j;
			j=z;
			
		}

	}

}
