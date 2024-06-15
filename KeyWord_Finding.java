package PlacementPrograms;

import java.util.Scanner;

public class KeyWord_Finding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		String[] arr=new String[n];
		for(int i=0;i<n;i++) {
			arr[i]=scanner.next();
		}
		String string=scanner.next();
       System.out.println(CheckingKeyword(arr,string));
       
	}
	public static String CheckingKeyword(String[] arr,String string) {
	       for(String i:arr) {
	    	   if(i.equals(string)) {
	    		   return "It is a Keyword";
	    	   }
	       }
	       return "It is not a Keyword";
	}

}
