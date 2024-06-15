package PlacementPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class COding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
	String string=scanner.next();
	int j=0;
	int[] fre=new int[26];	
	for(int i=0;i<string.length();i++) {
		fre[string.charAt(i)-'a']++;
	}
	System.out.println(Arrays.toString(fre));
	int cnt=0;
     for(int i=0;i<26;i++) {
    	 if(fre[i]==1) {
    		 System.out.println((char)((i)+'a'));
    		 cnt++;
    	 }
     }
     System.out.print(cnt);
	}

}
