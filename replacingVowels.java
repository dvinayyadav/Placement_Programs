package PlacementPrograms;

import java.util.Scanner;

public class replacingVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		String string=scanner.nextLine(),string1="";
		int cnt=0;
		for(int i=0;i<string.length();i++) {
			if(string.charAt(i)=='a' || string.charAt(i)=='e' || string.charAt(i)=='i' || string.charAt(i)=='o' || string.charAt(i)=='u' ) {
				cnt++;
			}
		}
		if(cnt>3) {
			for(int i=0;i<string.length();i++) {
				if(string.charAt(i)=='a' || string.charAt(i)=='e' || string.charAt(i)=='i' || string.charAt(i)=='o' || string.charAt(i)=='u' ) {
					string1+='-';
					
				}
				else {
					string1+=string.charAt(i);
				}
			}
		}
		System.out.println(string1);

	}

}
