package PlacementPrograms;

import java.util.Scanner;

public class Largest_Word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String string=sc.nextLine();
		int max=0;
		int cnt=0;
		for(int i=0;i<string.length();i++) {
			if(string.charAt(i)!=' ') {
				cnt++;
				if(cnt>max) {
					max=cnt;
				}
				
			}
			else {
				cnt=0;
				
			}
		}
		System.out.print(max);

	}

}
