package PlacementPrograms;

import java.util.*;

public class NoTwoConsecutiveCharacters {
	
	static int cnt=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		String string=scanner.nextLine();
		
		
		String string2=(frequencyString(string));
		char[] arr=new char[string2.length()];
		 if(string2.length()%2==0 && cnt>((string2.length()/2)+1)) {
			 System.out.println("NOT POSSIBLE");
		 }
		 else if(string2.length()%2==1 && cnt>(string2.length()/2)+2) {
			 System.out.println("NOT POSSIBLE");
		 }
		 else {
		int j=0;
		for(int i=0;i<string2.length();i+=2 ) {
			arr[i]=string2.charAt(j);
			j++;
		}
		for(int i=1;i<string2.length();i+=2) {
			arr[i]=string2.charAt(j);
			j++;
		}
		System.out.println(Arrays.toString(arr));
		 }
		

}
	public static String frequencyString(String string) {
		String newString="";
		int[] arr=new int[26];
		for(int i=0;i<string.length();i++) {
			arr[string.charAt(i)-'a']++;
		}
		System.out.println(Arrays.toString(arr));
		List<String> list=new ArrayList<String>();
		for(int i=0;i<26;i++) {
			if(arr[i]>0) {
				System.out.println((char)(i+'a')+" "+arr[i]);
				String ssString="";
				int cnt=arr[i];
				char ch=(char)(i+'a');
				for(int j=0;j<cnt;j++) {
					ssString+=ch;
				}
				list.add(ssString);
			}
		}
		
		List<String> list2=list.stream().sorted((a,b)->Integer.compare(b.length(),a.length())).toList();
		cnt=list2.get(0).length();
		for(String s:list2) {
			newString+=s;
		}
		return newString;
	}
	
	
}
