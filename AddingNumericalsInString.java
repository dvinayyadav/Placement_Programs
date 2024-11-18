package PlacementPrograms;

import java.util.ArrayList;
import java.util.Scanner;

public class AddingNumericalsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Input----11@@33SDFS44-+}#555
//	output---11+33+44+555
		Scanner scanner=new Scanner(System.in);
		int sum=0;
		ArrayList<Integer> list=new ArrayList<>();
		String temString="";
		String string=scanner.next();
		for(int i=0;i<string.length();i++) {
			
			char ch=string.charAt(i);
			if(Character.isDigit(ch)) {
			temString+=ch;
			}
			else {
				if(temString!="") {
				System.out.println(temString);
				sum+=Integer.parseInt(temString);
				temString="";
				}
			}
		}
		if(temString!="")
		sum+=Integer.valueOf(temString);
		System.out.println(sum);
	}

}
