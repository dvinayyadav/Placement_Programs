package PlacementPrograms;

import java.util.HashMap;
import java.util.Scanner;

public class StringGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
	     String str1=scanner.next();
	     String str2=scanner.next();
	     String anString="";
	    HashMap<Character,Integer> map=new HashMap<>();
	    for(int i=0;i<str2.length();i++) {
	    	char ch=str2.charAt(i);
	    	if(map.containsKey(ch)) {
	    		map.put(ch,1);
	    	}
	    	
	    }
	    for(int i=0;i<str1.length();i++) {
	    	char ch=str1.charAt(i);
	    	if(!map.containsKey(ch)) {
	    		anString=anString+ch;
	    	}
	    	
	    }
System.out.println(anString);
	}

}
