package PlacementPrograms;

import java.util.Scanner;

import javax.sound.midi.SysexMessage;

public class RemovIngOfSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		String str=scanner.nextLine();
		String str1="";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!=' ') {
				str1=str1+str.charAt(i);
			}
		}
System.out.println(str1);
	}

}
