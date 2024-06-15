package PlacementPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class OddFrequencyCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner scanner=new Scanner(System.in);
         int n=scanner.nextInt();
          char[] arr=new char[n];
          for(int i=0;i<n;i++) {
        	  arr[i]=scanner.next().charAt(0);
          }
          int[] fre=new int[26];
          for(int i=0;i<n;i++) {
        	  fre[arr[i]-'a']++;
          }
          System.out.println(Arrays.toString(fre));
          for(int i=0;i<26;i++) {
        	  if(fre[i]%2==1) {
        		  System.out.println((char)(i+'a'));
        		  break;
        	  }
          }
	}

}
