package PlacementPrograms;

import java.util.*;

public class frequencyOfletter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		String str1=scanner.next();
		String string=str1.toLowerCase();
		int[] arr=new int[26];
		for(int i=0;i<string.length();i++) {
			arr[string.charAt(i)-'a']++;
		}
		for(int i=0;i<26;i++) {
			if(arr[i]>0) {
				System.out.println((char)(i+'a')+" "+arr[i]);
			}
		}
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<string.length();i++) {
        	char ch=string.charAt(i);
        	if(!map.containsKey(ch)) {
        		map.put(ch,1);
        	}
        	else {
        		int ss=map.get(ch);
        		ss++;
        		map.put(ch,ss);
        	}
        }
        System.out.println(map.keySet());
        System.out.println(map.values());
        
        LinkedHashSet<Character> set=new LinkedHashSet();
        for(int i=0;i<string.length();i++) {
        	set.add(string.charAt(i));
        }
        for(Character i:set) {
        	int cnt=0;
        	for(int j=0;j<string.length();j++) {
        		if(i==string.charAt(j)) {
        			cnt++;
        		}
        	}
        	System.out.println(i+" :"+cnt);
        }
        
        
	}

}
