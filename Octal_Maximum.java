package PlacementPrograms;

import java.util.*;

public class Octal_Maximum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 4
47 22 35 11
98 15 160 34
2 228 900 7
5 1 23 1
we have to find sum of columns and find octal number of sum 
if octal number does not contains we have to print sum value in ascending order
 53 152 -----o/p

		 */
	
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int[][] arr=new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=scanner.nextInt();
			}
		}
		List<String> list=new ArrayList<>();
		List<Integer> list1=new ArrayList<>();
		for(int i=0;i<n;i++) {
			int sum=0;
			for(int j=0;j<n;j++) {
				sum+=arr[j][i];
			}
			list1.add(sum);
			list.add(OctalConversion(sum));
		}
		System.out.println(list1);
        System.out.println(list);
        List<Integer> list2=new ArrayList<>();
        for(int i=0;i<list.size();i++) {
        	for(int j=0;j<(list.get(i)).length();j++) {
        		if(list.get(i).charAt(j)=='1') {
        			list2.add(list1.get(i));
        		}
        	}
        }
       
        list1.removeAll(list2);
        System.out.println(list2);
        Collections.sort(list1);
        for(int i:list1) {
        	System.out.print(i+" ");
        }
	}
	public static String OctalConversion(int n) {
		String ON="";
		while(n>0) {
			int r=n%8;
			ON=(r)+ON;
			n/=8;
		}
		return ON;
	}

}
