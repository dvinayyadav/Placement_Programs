package PlacementPrograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PangramsCheckIng {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		List<String> stringList=new ArrayList<>();
		int n=scanner.nextInt();
		for(int i=0;i<n;i++) {
			stringList.add(scanner.nextLine());
		}
		String anString="";
		for(String aa:stringList) {
			if(isPangram(aa)) {
				anString+='1';
			}
			else {
				anString+='0';
			}
		}
		System.out.println(anString);

	}

	private static boolean isPangram(String str){
		// TODO Auto-generated method stub
		int[] arr=new int[26];
		String string=str.toLowerCase();
		for(int i=0;i<string.length();i++) {
			if(string.charAt(i)!=' ')
			arr[string.charAt(i)-'a']++;
		}
		for(int i=0;i<26;i++) {
			if(arr[i]==0) {
				return false;
			}
		}
		return true;
	}

}
