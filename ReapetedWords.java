package PlacementPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ReapetedWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		String string=scanner.nextLine();
		System.out.println(string);
		HashMap<String,Integer> map=new HashMap<>();
		String s="";
		for(int i=0;i<string.length();i++) {	
			if(string.charAt(i)!=' ') {
				s=s+string.charAt(i);
			}
			else {
				System.out.println(s);
				if(map.containsKey(s)) {
					int r=map.get(s)+1;
					map.put(s,r);
				}
				else {
					map.put(s,1);
				}
				s="";
			}
			
		}
		String str1="";
		for(int i=string.length()-1;i>=0;i--) {
			if(string.charAt(i)!=' ') {
				str1=string.charAt(i)+str1;
			}else {
				break;
			}
		}
		
		if(map.containsKey(str1)) {
			int r=map.get(str1)+1;
			map.put(str1,r);
		}
		else {
			map.put(str1,1);
		}
		for(Map.Entry<String,Integer> i:map.entrySet()) {
			if(i.getValue()>1) {
				System.out.print(i.getKey()+"     ");
			}
		}
System.out.print(map);
	}

}
