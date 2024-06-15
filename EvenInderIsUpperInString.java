package PlacementPrograms;

import java.util.Scanner;

public class EvenInderIsUpperInString {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		Scanner scanner=new Scanner(System.in);
		String string=scanner.next();
		String str1=string.toLowerCase();
		System.out.println(str1);
		String anString="";
		for(int i=0;i<str1.length();i++) {
			if(i%2==0) {
				anString=anString+str1.charAt(i);
			}
                else {
                	anString=anString+Character.toUpperCase(str1.charAt(i));
}
			}
		System.out.println(anString);
		
		}
	}


