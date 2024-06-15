package PlacementPrograms;

import java.util.Scanner;


public class Frogs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i:arr) {
			if(isPower(i)) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}

	}
	static boolean isPower(int n) {

        if (n == 0)
            return false;
 
        while (n != 1) {
            if (n % 2 != 0)
                return false;
            n = n / 2;
        }
        return true;
	}
	 

}
