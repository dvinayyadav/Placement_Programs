package PlacementPrograms;

import java.util.ArrayList;
import java.util.*;


public class FIBINOCCI_PRIME {
	public static boolean IsPrime(int n) {
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		ArrayList<Integer> list=new ArrayList<>();
		for(int i=2;i<n;i++) {
			if(IsPrime(i)) {
				list.add(i);
			}
		}
        int a=1;
    	int b=1;
    	int[] arr=new int[n];
    	arr[0]=1;
    	arr[2]=1;
        for(int i=4;i<n;i++) {
        	int c=a+b;
        	arr[i]=c;
        	a=b;
        	b=c;
        }
        int j=0;
        for(int i=1;i<n;i+=2) {
        	arr[i]=list.get(j);
        	j++;
        }
        System.out.print(Arrays.toString(arr));
	}
	

}
