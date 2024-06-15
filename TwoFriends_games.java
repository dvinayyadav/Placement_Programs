package PlacementPrograms;

import java.util.Scanner;

public class TwoFriends_games {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		String string=scanner.next();
		String string2=scanner.next();
		int Erica=0,Bob=0;
		for(int i=0;i<string.length();i++) {
			char ch=string.charAt(i);
			if(ch=='H') {
				Erica+=5;
			}
			else if (ch=='E') {
				Erica+=1;
			}
			else {
				Erica+=3;
			}
		}
			for(int i=0;i<string2.length();i++) {
				char ch=string2.charAt(i);
				if(ch=='H') {
					Bob+=5;
				}
				else if (ch=='E') {
					Bob+=1;
				}
				else {
					Bob+=3;
				}
		}
			if(Erica>Bob) {
				System.out.println("Erica");
			}
			else {
			System.out.println("Bob");
			}
	}

}
