package PlacementPrograms;

import java.util.*;
import java.util.Scanner;

public class ARRAYTOMATRIX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		String str=scanner.nextLine();
		String str1="";
		for(int i=0;i<str.length();i++) {
			if(Character.isAlphabetic(str.charAt(i))) {
				str1+=str.charAt(i);
			}
		}
		int l=str1.length();
		char[] arr=str1.toCharArray();
		System.out.println(Arrays.toString(arr));
	    ArrayList<Integer> list=new ArrayList<>();
	    for(int i=1;i<=l;i++) {
	    	if(l%i==0) {
	    		list.add(i);
	    	}
	    }
	    int n=list.get((list.size()-1)/2);
	    int m=list.get((list.size()+1)/2);
	    System.out.println(n+" "+m);
	    System.out.println(list);
	    int k=0;
	    char[][] mat=new char[n][m];
	    for(int i=0;i<n;i++) {
	    	for(int j=0;j<m;j++) {
	    		mat[i][j]=arr[k];
	    		
	    		System.out.print(arr[k]+" ");
	    		k++;
	    	}
	    	System.out.println();
	    }
		
	    for(int i=0;i<m;i++) {
	    	for(int j=0;j<n;j++) {
	    		System.out.print(mat[j][i]);
	    	}
	    	System.out.print(" ");
	    }

	}

}
