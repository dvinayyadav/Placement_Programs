package PlacementPrograms;

import java.util.Arrays;
import java.util.Scanner;


public class ArrangmentOfigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int num1=scanner.nextInt();
		int num2=scanner.nextInt();
		int num3=scanner.nextInt();
		int[] arr1=new int[4];
		int[] arr2=new int[4];
		int[] arr3=new int[4];
		for(int i=3;i>=0;i--) {
			arr1[i]=num1%10;
			arr2[i]=num2%10;
			arr3[i]=num3%10;
			num1/=10;
			num2/=10;
			num3/=10;
		}
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
		int num=0;
		for(int i=0;i<4;i++) {
			if(i%2==0) {
				num=(num*10)+Math.min(arr1[i],Math.min(arr2[i],arr3[i]) );
				System.out.println(num);
			}
			else {
				num=(num*10)+Math.max(arr1[i],Math.max(arr2[i],arr3[i]) );
				System.out.println(num);
			}
		}
		System.out.print(num);
	}

}
