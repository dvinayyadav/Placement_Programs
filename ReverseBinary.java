package PlacementPrograms;

import java.util.Scanner;

public class ReverseBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 1101010---- input
		 * we have reverse a string and print number of characters are exchanged
		 * 0101011------reverse String
		 * 2--o/p 
		 */
		Scanner scanner=new Scanner(System.in);
		String string=scanner.next();
		String string2="";
		for(int i=0;i<string.length();i++) {
			string2=string.charAt(i)+string2;
		}
		System.out.println(string2);
		int cnt=0;
		for(int i=0;i<string.length();i++) {
			if(string.charAt(i)!=string2.charAt(i)) {
				cnt++;
			}
		}
		System.out.println(cnt);

	}

}
