package PlacementPrograms;

import java.util.Scanner;

public class converting_words {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		String str1=scanner.next(),str1a="",str2a="",str3a="";
		String str2=scanner.next();
		String str3=scanner.next();
		String anString="";
		
		for(int i=0;i<str1.length();i++) {
			if(str1.charAt(i)=='a' || str1.charAt(i)=='e' || str1.charAt(i)=='i' || str1.charAt(i)=='o' || str1.charAt(i)=='u' ) {
				str1a+='*';
			}
			else {
				str1a+=str1.charAt(i);
			}
		}
		for(int i=0;i<str1.length();i++) {
			if(str2.charAt(i)=='a' || str2.charAt(i)=='e' || str2.charAt(i)=='i' || str2.charAt(i)=='o' || str2.charAt(i)=='u' ){
				str2a+=str2.charAt(i);
			}
			else {
				str2a+='@';
			}
		}
		str3a=str3.toUpperCase();
		System.out.println(str1a);
		System.out.println(str2a);
		System.out.println(str3a);
		anString=str1a+str2a+str3a;
		System.out.println(anString);

	}

}
