package PlacementPrograms;

import java.util.Scanner;

public class Permutations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		String string=scanner.next();
		stringPer("",string);
		

	}
	public static void stringPer(String ss,String str) {
		if(str.length()==0) {
			System.out.println(ss);
		}
		else {
			for (int i = 0; i < str.length(); i++) {
				stringPer(ss+str.charAt(i),str.substring(0,i)+str.substring(i+1, str.length()));
			}
		}
	}

}
