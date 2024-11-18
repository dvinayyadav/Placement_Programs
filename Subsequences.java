package PlacementPrograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Subsequences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		String str=scanner.next();
		ArrayList<String> list=printingSubsequences(str);
		System.out.println(list.size());
		System.out.println("SUBSEQUENCES");
		System.out.println(list);
		System.out.println("SORTING ACCORDING TO LENGTH");
		List<String> list2=list.stream().sorted().toList();
		List<String> l2=list2.stream().sorted((a,b)->Integer.compare(a.length(),b.length())).toList();
		System.out.println(l2);
		System.out.println("SORTED ACCORDING TO LENGTH REVERSE");
		List<String> l3=list2.stream().sorted((a,b)->Integer.compare(b.length(),a.length())).toList();
		System.out.println(l3);
	}
	public static ArrayList<String> printingSubsequences(String str) {
		if(str.length()==0) {
			ArrayList<String> l=new ArrayList<>();
			l.add("");
			return l;
		}
		char ch=str.charAt(0);
		String string=str.substring(1);
		ArrayList<String> l1=printingSubsequences(string);
		ArrayList<String> l2=new ArrayList<>();
		for(String i:l1) {
			l2.add(""+i);
		}
		for(String i:l1) {
			l2.add(ch+i);
		}
	return l2;
	}
	

}
