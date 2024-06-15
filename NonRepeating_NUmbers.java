package PlacementPrograms;

import java.util.HashSet;
import java.util.Scanner;

public class NonRepeating_NUmbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int m=scanner.nextInt();
		int cnt=0;
		for(int i=n;i<m;i++) {
			HashSet<Character> set=new HashSet<>();
			String string=Integer.toString(i);
			for(int j=0;j<string.length();j++) {
				set.add(string.charAt(j));
			}
			if(string.length()==set.size()) {
				System.out.println(set);
				cnt++;
			}
		}
		System.out.println();
           System.out.println(cnt);
	}

}
